package com.example.milcuentos.Class;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.milcuentos.R;

public class BookFragment extends Fragment {
    private static final String ARG_BOOK_CONTENT = "book_content";

    private String bookContent;

    public static BookFragment newInstance(String bookContent) {
        BookFragment fragment = new BookFragment();
        Bundle args = new Bundle();
        args.putString(ARG_BOOK_CONTENT, bookContent);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            bookContent = getArguments().getString(ARG_BOOK_CONTENT);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book, container, false);
        TextView textViewBookContent = view.findViewById(R.id.textViewBookContent);
        textViewBookContent.setText(bookContent);

        return view;
    }
}

