package com.demo.soap.test.birthday;

import com.org.webservicesoap.birthday.GetBirthdayRequest;
import org.springframework.stereotype.Service;
import com.org.webservicesoap.birthday.GetAgeResponse;

import java.time.LocalDate;
import java.time.Period;

@Service
public class BirthdayService {
    public GetAgeResponse age(GetBirthdayRequest request){
        GetAgeResponse getAgeResponse = new GetAgeResponse();
        if (validateDay(request) && validateMonth(request) && validateYear(request) ){
            getAgeResponse.setAge(getAge(request.getDay(), request.getMonth(),request.getYear()));
        }
        return getAgeResponse;
    }

    private boolean validateDay(GetBirthdayRequest request) {
        return request.getDay() > 0 && request.getDay() <= 31;
    }

    private boolean validateMonth(GetBirthdayRequest request) {
        return request.getMonth() > 0 && request.getMonth() <= 12;
    }

    private boolean validateYear(GetBirthdayRequest request) {
        return request.getYear() >= 1920 && request.getYear() <= LocalDate.now().getYear();
    }


    private int getAge(int day, int month, int year) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        Period period = Period.between(birthday,today);

        return period.getYears();
    }

}
