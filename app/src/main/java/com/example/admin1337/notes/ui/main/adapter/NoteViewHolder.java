package com.example.admin1337.notes.ui.main.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.admin1337.notes.R;
import com.example.admin1337.notes.model.Note;

/**
 * @author Alexey Mazaev
 */

public class NoteViewHolder
    extends RecyclerView.ViewHolder {

  @BindView(R.id.tvTitle) TextView title;

  @BindView(R.id.tvBody) TextView body;

  public NoteViewHolder(View itemView) {
    super(itemView); ButterKnife.bind(this, itemView);
  }

  public void bind(Object item) {
    Note note = (Note) item;

    title.setText(note.getTitle()); body.setText(note.getBody());
  }
}
