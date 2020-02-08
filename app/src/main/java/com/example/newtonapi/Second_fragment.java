package com.example.newtonapi;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Second_fragment extends Fragment {

    Button onResultClick;
    EditText expression;
    View layoutView;

    public Second_fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        layoutView = view;
        onResultClick = view.findViewById(R.id.btngeoresult);
        expression = view.findViewById(R.id.geoExpression);

        final Spinner dropdown = view.findViewById(R.id.spinner_trigonometri);
        String[] items = new String[]{"Sin", "Cos", "Tan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        onResultClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String operationType = dropdown.getSelectedItem().toString();
                IDataService service = RetrofitClient.getRetrofitInstance().create(IDataService.class);
                String  expressionString = expression.getText().toString();

                Call<MathResult> call = service.evaluateOperation(operationType.toLowerCase(), expressionString);
                call.enqueue(new Callback<MathResult>() {
                    @Override
                    public void onResponse(Call<MathResult> call, Response<MathResult> response) {
                        MathResult result  = response.body();
                        try {
                            String resultString = result.getResult();
                            String exp = result.getExpression();
                            String operation = result.getOperation();

                            Bundle bundle = new Bundle();
                            bundle.putString("result", resultString);
                            bundle.putString("expression", exp);
                            bundle.putString("operation", operation);
                            Navigation.findNavController(layoutView).navigate(R.id.result, bundle);

                        }catch (NullPointerException exception){

                        }

                    }

                    @Override
                    public void onFailure(Call<MathResult> call, Throwable t) {
                        Toast.makeText(getActivity().getApplicationContext(), "Something Went Wrong!" + t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.geometric, container, false);
    }
}
