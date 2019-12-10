package org.nocoder.builder.pizza;

import java.util.Objects;

/**
 * NewYorkPizza
 * 必须参数：Size 尺寸
 */
public class NewYorkPizza extends Pizza {

    public enum Size { SMALL, MEDIUM, LARGE }

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private final  Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        NewYorkPizza build() {
            return new NewYorkPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


    private NewYorkPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public Size getSize() {
        return size;
    }
}
