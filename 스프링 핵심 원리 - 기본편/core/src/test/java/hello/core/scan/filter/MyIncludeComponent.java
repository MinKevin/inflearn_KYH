package hello.core.scan.filter;

import java.lang.annotation.*;

//ElementType.TYPE => Class 에 붙음
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
