package com.example.login.instaApi.models;

public class Images {
    private  Standard_resolution standard_resolution;

    public Standard_resolution getStandard_resolution() {
        return standard_resolution;
    }
    public class Standard_resolution{
        private String url;
        public String getUrl(){
            return url;
        }
    }

}
