package com.laioffer.tinnews.save;

import com.laioffer.tinnews.mvp.MvpContract;

//1.1 1.2 Create a new SavedNewsContract interface under save folder
public interface SavedNewsContract {

    interface View extends MvpContract.View<Presenter> {
    }

    interface Presenter extends  MvpContract.Presenter<View, Model> {
    }

    interface Model extends MvpContract.Model<Presenter> {
    }
}
