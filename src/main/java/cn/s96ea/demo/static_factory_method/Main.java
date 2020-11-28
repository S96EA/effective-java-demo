package cn.s96ea.demo.static_factory_method;

import java.sql.DriverManager;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 两面两个方法都是构造Integer，并且参数类型相同，使用静态方法命名
        System.out.println(Integer.valueOf("1"));
        System.out.println(Integer.decode("10"));


        // 使用静态方法不需要每次都创建一个新的对象
        System.out.println(Integer.valueOf(1) == Integer.valueOf(1));


        // 使用静态方法可以隐藏具体实现
        List.of(1);

        System.out.println(EnumSet.range(N30.N0, N30.N29).getClass());
        System.out.println(EnumSet.range(N100.N0, N100.N29).getClass());


    }
}

enum N30 {
    N0, N1, N2, N3, N4, N5, N6, N7, N8, N9, N10, N11, N12, N13, N14,
    N15, N16, N17, N18, N19, N20, N21, N22, N23, N24, N25, N26, N27,
    N28, N29
}

enum N100 {
    N0, N1, N2, N3, N4, N5, N6, N7, N8, N9, N10, N11, N12, N13, N14,
    N15, N16, N17, N18, N19, N20, N21, N22, N23, N24, N25, N26, N27,
    N28, N29, N30, N31, N32, N33, N34, N35, N36, N37, N38, N39, N40,
    N41, N42, N43, N44, N45, N46, N47, N48, N49, N50, N51, N52, N53,
    N54, N55, N56, N57, N58, N59, N60, N61, N62, N63, N64, N65, N66,
    N67, N68, N69, N70, N71, N72, N73, N74, N75, N76, N77, N78, N79,
    N80, N81, N82, N83, N84, N85, N86, N87, N88, N89, N90, N91, N92,
    N93, N94, N95, N96, N97, N98, N99
}
