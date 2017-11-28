package com.lijingyao.dp.design.decorator;

/**
 * Wrapper (decorator) design pattern. Created by yunshen.ljy on 2015/7/23.
 */
public final class WrapperDemo {

    public static void main(String... aArgs) {
//                TransformText transformer = null;
//                new BaseWrapper(new Echo());
//        show(transformer.render("blah.")); // 'blah.'
//
//        transformer = new Capitalize(new Echo());
//        show(transformer.render("blah.")); // 'BLAH.'

        TransformText transformer = new Capitalize(new RemovePeriods(new Echo()));
        show(transformer.render("blah.")); // 'BLAH'

        transformer = new RemovePeriods(new Echo());
        show(transformer.render("blah.")); // 'blah'
    }

    private static void show(String aText) {
        System.out.println(aText);
    }

    private static final class Echo implements TransformText {
        public String render(String aText) {
            return aText;
        }
    }

    /**
     * Decotrator
     */
    private static class BaseWrapper implements TransformText {
        BaseWrapper(TransformText aTransformText) {
            fShowText = aTransformText;
        }

        /** Template method, calls 'before' and 'after' methods. */
        public final String render(String aText) {
            String text = before(aText);
            text = fShowText.render(text); // call-forward
//            fShowText instanceof
            return after(text);
        }

        /** This default implementation does nothing. */
        String before(String aText) {
            return aText;
        }

        /** This default implementation does nothing. */
        String after(String aText) {
            return aText;
        }

        private TransformText fShowText;
    }

    private static final class Capitalize extends BaseWrapper {
        Capitalize(TransformText aTransformText) {
            super(aTransformText);
        }

        @Override
        String before(String aText) {
            if(super.fShowText instanceof RemovePeriods){
            }
            String result = aText;
            if (aText != null) {
                result = result.toUpperCase();
            }
            return result;
        }



        @Override
        String after(String aText) {
            String result = aText;
            if (aText != null) {
                result = result +".";
            }
            return result;
        }
    }

    private static final class RemovePeriods extends BaseWrapper {
        RemovePeriods(TransformText aTransformText) {
            super(aTransformText);
        }

        @Override
        String after(String aText) {
            String result = aText;
            if (aText != null) {
                result = result.replace(".", "");
            }
            return result;
        }
    }
}