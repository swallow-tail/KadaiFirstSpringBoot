package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class KadaiFirstController {

      //アプリケーション起動確認
        @GetMapping("/")
        public String index() {
            return "Hello SpringBoot!";
        }

        //仕様1：指定日の曜日を算定する
        @GetMapping("/dayofweek/yyyymmdd")
        public String substring() {
            String yyyymmdd = "yyyymmdd";
            String year = yyyymmdd.substring(0,4);
            String month = yyyymmdd.substring(4,6);
            String day = yyyymmdd.substring(6,8);
            return "実行結果：" + year + month + day;
        }

        //仕様2：四則演算を行なう
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
