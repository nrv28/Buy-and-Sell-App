package com.example.olx.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.olx.R
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Sellactivity : AppCompatActivity() {

    private lateinit var item_namee: EditText
    private lateinit var item_price: EditText
    private lateinit var item_contact: EditText
    private lateinit var upload_btn: Button

    private lateinit var dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sellactivity)

        item_namee = findViewById(R.id.item_name)
        item_price = findViewById(R.id.selling_price)
        item_contact = findViewById(R.id.contact_number)
        upload_btn = findViewById(R.id.upload)

        dbRef = FirebaseDatabase.getInstance().getReference("Product Details")

        upload_btn.setOnClickListener {
            // Get the values from EditText fields
            val itemName = item_namee.text.toString()
            val itemPrice = item_price.text.toString()
            val itemContact = item_contact.text.toString()

            // Check if any field is empty
            if (itemName.isEmpty() || itemPrice.isEmpty() || itemContact.isEmpty()) {
                showMessage("Please fill in all fields")
                return@setOnClickListener
            }

            // Create a Product object with the values
            val product = Product(itemName, itemPrice, itemContact)

            // Push the product to the "Product Details" node in the database
            val newProductRef = dbRef.push()
            newProductRef.setValue(product)
                .addOnSuccessListener {
                    // Handle successful upload
                    showMessage("Upload successful")
                    // Optionally, you can clear the EditText fields after uploading
                    item_namee.text.clear()
                    item_price.text.clear()
                    item_contact.text.clear()
                }
                .addOnFailureListener {
                    // Handle unsuccessful upload
                    showMessage("Upload failed. Please try again.")
                }
        }
    }

    // Create a data class to represent the structure of the product
    data class Product(val itemName: String, val itemPrice: String, val itemContact: String)

    private fun showMessage(message: String) {
        Snackbar.make(upload_btn, message, Snackbar.LENGTH_SHORT).show()
    }
}
