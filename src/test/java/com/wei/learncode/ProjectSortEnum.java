package com.wei.learncode;

public enum ProjectSortEnum {

    SUBWAY, BIZCIRCLE,COMMUTER_COMPANY,USER_LOCATION,DEFAULT;

    ProjectSortEnum() {
    }

    public static void main(String[] args) {
        ProjectSortEnum projectSortEnum = ProjectSortEnum.COMMUTER_COMPANY;
        switch (projectSortEnum){
            case DEFAULT:
                System.out.println(1);
                break;
            case USER_LOCATION:
                System.out.println(2);
            break;
        }
    }
}
