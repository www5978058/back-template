package com.wzh.back_template.convert;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wzh
 * @date 2020/1/7 - 17:45
 */
public class Test {
    public static void main(String[] args) {
        BConvert bConvert = new BConvert();
        System.out.println(bConvert.doForward(new A("zs", "china", 18)));
    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class A{
    private String name;
    private String address;
    private Integer age;
}
@Data
class B{
    private String address;
    private String age;
}
class BConvert extends BaseConverter<A,B>{

}
