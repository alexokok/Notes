package com.example.admin1337.notes.ui.main.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.example.admin1337.notes.ui.common.AdapterDelegate;

/**
 * @author Alexey Mazaev
 */

public class NoteAdapterDelegate
    implements AdapterDelegate<Object> {

  @Override
  public boolean isForViewType(@NonNull Object items, int position) {
    return false;
  }

  @NonNull
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
    return null;
  }

  @Override
  public void onBindViewHolder(@NonNull Object items, int position,
      @NonNull RecyclerView.ViewHolder holder) {

  }
}
