package com.college.momskitchenrecipe.View.Detail;

import androidx.annotation.NonNull;

import com.college.momskitchenrecipe.Model.Meals;
import com.college.momskitchenrecipe.Utils.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailPresenter {
    private DetailView view;

    public DetailPresenter(DetailView view){
        this.view = view;
    }

    void getMealById(String mealName){
        view.showLoading();
        Utils.getAPI().getMealByName(mealName)
                .enqueue(new Callback<Meals>() {

                    @Override
                    public void onResponse(@NonNull Call<Meals> call, Response<Meals> response) {
                        view.hideLoading();
                        if(response.isSuccessful() && response.body() != null){
                            view.setMeal(response.body().getMeals().get(0));
                        }else{
                            view.onErrorLoading(response.message());
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<Meals> call, @NonNull Throwable t) {
                        view.hideLoading();
                        view.onErrorLoading(t.getLocalizedMessage());
                    }
                });
    }

}
