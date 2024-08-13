// Generated by view binder compiler. Do not edit!
package com.example.olx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.olx.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBsactivityBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buy;

  @NonNull
  public final Button sell;

  @NonNull
  public final TextView textView;

  private ActivityBsactivityBinding(@NonNull ConstraintLayout rootView, @NonNull Button buy,
      @NonNull Button sell, @NonNull TextView textView) {
    this.rootView = rootView;
    this.buy = buy;
    this.sell = sell;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBsactivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBsactivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bsactivity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBsactivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buy;
      Button buy = ViewBindings.findChildViewById(rootView, id);
      if (buy == null) {
        break missingId;
      }

      id = R.id.sell;
      Button sell = ViewBindings.findChildViewById(rootView, id);
      if (sell == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityBsactivityBinding((ConstraintLayout) rootView, buy, sell, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
