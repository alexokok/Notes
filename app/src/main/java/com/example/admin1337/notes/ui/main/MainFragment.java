package com.example.admin1337.notes.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.admin1337.notes.R;
import com.example.admin1337.notes.model.Note;
import com.example.admin1337.notes.model.NoteType;
import com.example.admin1337.notes.ui.common.BaseAdapter;
import com.example.admin1337.notes.ui.main.adapter.NoteAdapterDelegate;
import java.util.ArrayList;

/**
 * @author Mazaev Alexey
 */

public class MainFragment
    extends Fragment {

  public static MainFragment newInstance() {
    return new MainFragment();
  }

  @BindView(R.id.notesRecycler) RecyclerView notesRecycler;

  private BaseAdapter<Object> adapter;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_main, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState); ButterKnife.bind(this, view);

    initBaseAdapter(); initRecyclerView(); initSimpleData();
  }

  private void initBaseAdapter() {
    NoteAdapterDelegate noteDelegate = new NoteAdapterDelegate(); adapter = new BaseAdapter<>();
    adapter.addDelegate(noteDelegate);
  }

  private void initRecyclerView() {
    notesRecycler.setAdapter(adapter);
  }

  private void initSimpleData() {
    ArrayList<Object> notes = new ArrayList<>();
    notes.add(new Note("Заголовок", NoteType.NOTE, "Тело")); adapter.setData(notes);
  }
}
