package org.hswebframework.web.bean;

import lombok.*;

/**
 * @author zhouhao
 * @since
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NestObject implements Cloneable {
    private String name;

    private int age;


    @ToString.Ignore
    private String password ;

    @Override
    public NestObject clone() throws CloneNotSupportedException {
        return (NestObject) super.clone();
    }

    @Override
    public String toString() {
        return ToString.toString(this);
    }
}
