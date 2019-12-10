package org.nocoder.builder.pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * Builder 模式非常适合类层次结构。
 * 使用平行层次的 builder，每个builder嵌套在相应的类中。
 * 抽象类有抽象的 builder；具体的类有具体的 builder
 * 代表各种比萨饼的根层次结构的抽象类
 */
public abstract class Pizza {

    public enum Topping{ HAM, MUSHROOM, ONION }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        /**
         * 允许方法链在子类中正常工作，而不需要强制转换
         * 子类必须重写self方法，返回子类Builder实例
         * Java缺乏自我类型的这种变通解决办法称为模拟自我类型
         * @return
         */
        protected abstract T self();
    }

    public Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
