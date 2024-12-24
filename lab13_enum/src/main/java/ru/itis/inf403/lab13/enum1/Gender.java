package ru.itis.inf403.lab13.enum1;

public enum Gender {
    Female(1),
    Male(2);

    private int code;

    Gender(int code) {
        this.code = code;
    }

    public static Gender findByCode(int code) {
        if (code == 1) return Gender.Female;
        else return Gender.Male;
    }
}
