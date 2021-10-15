package com.college.momskitchenrecipe.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Categories implements Serializable {
    @SerializedName("categories")
    @Expose
    private List<Category> categories;

    public List<Category> getCategories(){
        return categories;
    }

    public void setCategories(List<Category> categories){
        this.categories = categories;
    }

    public static class Category  implements Serializable{
        @SerializedName("idCategory")
        @Expose
        private String idCategory;
        @SerializedName("strCategory")
        @Expose
        private String strCategory;
        @SerializedName("strCategoryThumb")
        @Expose
        private String strCategoryThumb;
        @SerializedName("strCategoryDescription")
        @Expose
        private String getStrCategoryDescription;

        public String getIdCategory() {
            return idCategory;
        }

        public void setIdCategory(String idCategory) {
            this.idCategory = idCategory;
        }

        public String getStrCategory() {
            return strCategory;
        }

        public void setStrCategory(String strCategory) {
            this.strCategory = strCategory;
        }

        public String getStrCategoryThumb() {
            return strCategoryThumb;
        }

        public void setStrCategoryThumb(String strCategoryThumb) {
            this.strCategoryThumb = strCategoryThumb;
        }

        public String getGetStrCategoryDescription() {
            return getStrCategoryDescription;
        }

        public void setGetStrCategoryDescription(String getStrCategoryDescription) {
            this.getStrCategoryDescription = getStrCategoryDescription;
        }
    }
}
