package com.techacademy;

import java.util.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    // アプリケーション起動確認
    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }

    // 仕様1：指定日の曜日を算定する
    @GetMapping("/dayofweek/{yyyymmdd}")
    public String dispDayOfWeek(@PathVariable String yyyymmdd) {
        int year = Integer.parseInt(yyyymmdd.substring(0, 4));
        int month = Integer.parseInt(yyyymmdd.substring(4, 6)) -1;
        int day = Integer.parseInt(yyyymmdd.substring(6, 8));

        // 日付から曜日を取得する
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.SUNDAY:
            return "実行結果：" + "Sunday";
        case Calendar.MONDAY:
            return "実行結果：" + "Monday";
        case Calendar.TUESDAY:
            return "実行結果：" + "Tuesday";
        case Calendar.WEDNESDAY:
            return "実行結果：" + "Wednesday";
        case Calendar.THURSDAY:
            return "実行結果：" + "Thursday";
        case Calendar.FRIDAY:
            return "実行結果：" + "Friday";
        case Calendar.SATURDAY:
            return "実行結果：" + "Saturday";
        default:
            return "曜日が分かりませんでした";
        }
    }

    // 仕様2：四則演算を行なう
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果：" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "実行結果：" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "実行結果：" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "実行結果：" + res;
    }

}
