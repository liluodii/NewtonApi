package com.example.newtonapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IDataService {

    @GET("{operation}/{expression}")
    Call<MathResult> evaluateOperation(@Path(value = "operation", encoded = true) String operation,
                                      @Path(value = "expression", encoded = true) String expression);


}
