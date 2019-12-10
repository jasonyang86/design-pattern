package org.nocoder.builder.pizza;

/**
 * 半圆形烤乳酪馅饼
 * 必须的参数：酱汁在里面还是外面
 */
public class CalzonePizza extends Pizza {
    /**
     * 酱汁是否在里面
     */
    private final boolean isSauceInside;

    public static class Builder extends Pizza.Builder<Builder>{
        private boolean isSauceInside;

        public Builder isSauceInside() {
            isSauceInside = true;
            return this;
        }

        /**
         * 子类的builder中的build方法被声明为返回正确的子类型
         * 这种技术，其一个类的方法被声明为返回在超类中声明的返回类型的子类型，称为协变返回类型。
         * 它允许客户端使用这些builder，而不需要强制转换
         * @return
         */
        @Override
        CalzonePizza build() {
            return new CalzonePizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public CalzonePizza(Builder builder) {
        super(builder);
        isSauceInside = builder.isSauceInside;
    }

    public boolean isSauceInside() {
        return isSauceInside;
    }
}
