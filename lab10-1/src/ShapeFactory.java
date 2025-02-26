public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;
    private static int countCircle = 0;
    private static int countCircleLimit = 2;
    private static int countRectangle = 0;
    private static int countRectangleLimit = 2;
    private static int countSquare = 0;
    private static int countSquareLimit = 2;
    private static int countShape = 0;
    private static int countShapeLimit = 5;
    public static Shape getShape(int type) {
        switch (type) {
            case TYPE_CIRCLE:
                if(countCircle < countCircleLimit && countShape < countShapeLimit) {
                    countCircle++;
                    countShape++;
                    return new Circle();
                } else {
                    return null;
                }

            case TYPE_RECTANGLE:
                if(countRectangle < countRectangleLimit && countShape < countShapeLimit) {
                    countRectangle++;
                    countShape++;
                    return new Rectangle();
                } else {
                    return null;
                }

            case TYPE_SQUARE:
                if(countSquare < countSquareLimit && countShape < countShapeLimit) {
                    countSquare++;
                    countShape++;
                    return new Square();
                } else {
                    return null;
                }

            default:
                return null;
        }
    }
}