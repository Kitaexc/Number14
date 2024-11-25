package com.example.number14;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.widget.PopupMenu;

public class DashboardFragment extends Fragment {

    public DashboardFragment() {
        super(R.layout.fragment_dashboard);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.dashboard_button);

        button.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(requireContext(), button);
            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {
                if (item.getItemId() == R.id.action_increase) {
                    Toast.makeText(getContext(), "Счёт увеличен!", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if (item.getItemId() == R.id.action_reset) {
                    Toast.makeText(getContext(), "Счёт сброшен!", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else {
                    return false;
                }
            });

            popupMenu.show();
        });
    }
}
