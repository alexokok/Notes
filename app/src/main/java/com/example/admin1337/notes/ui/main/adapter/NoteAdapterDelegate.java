package com.example.admin1337.notes.ui.main.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.admin1337.notes.R;
import com.example.admin1337.notes.model.Note;
import com.example.admin1337.notes.ui.common.AdapterDelegate;

/**
 * @author Alexey Mazaev
 */

public class NoteAdapterDelegate
    implements AdapterDelegate<Object> {

  @Override
  public boolean isForViewType(@NonNull Object items, int position) {
    return items instanceof Note;
  }

  @NonNull
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
    return new NoteViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull Object items, int position,
      @NonNull RecyclerView.ViewHolder holder) {
    ((NoteViewHolder) holder).bind(items);
  }
}
