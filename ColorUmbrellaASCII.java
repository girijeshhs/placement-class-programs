public class ColorUmbrellaASCII {

    // ANSI escape codes for colors
    private static final String RESET  = "\u001B[0m";
    private static final String[] COLORS = {
            "\u001B[31m", // 0 - Red
            "\u001B[33m", // 1 - Orange (approx using Yellow)
            "\u001B[93m", // 2 - Yellow (bright)
            "\u001B[32m", // 3 - Green
            "\u001B[34m", // 4 - Blue
            "\u001B[35m", // 5 - Indigo (Magenta-ish)
            "\u001B[95m"  // 6 - Violet (Bright Magenta)
    };

    public static void main(String[] args) {

        // Umbrella top pattern: '^' marks the colored area
        String[] top = {
                "        _______        ",
                "     _/^^^^^^^^^\\_     ",
                "   /^^^^^^^^^^^^^^^\\   ",
                " /^^^^^^^^^^^^^^^^^^^\\ "
        };

        int width = top[0].length();

        // Print umbrella top with 7-color stripes
        for (String line : top) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < width; col++) {
                char ch = line.charAt(col);

                if (ch == '^' || ch == '_' || ch == '/' || ch == '\\') {
                    // Decide which color based on horizontal position
                    int colorIndex = (col * COLORS.length) / width;
                    if (colorIndex >= COLORS.length) {
                        colorIndex = COLORS.length - 1;
                    }
                    sb.append(COLORS[colorIndex]).append('#').append(RESET);
                } else {
                    sb.append(' ');
                }
            }
            System.out.println(sb.toString());
        }

        // Umbrella stick (handle) – center aligned to the top
        String stickLine = "          |          ";
        String hookLine  = "         |_        ";

        // Brown-like color (blend of red + yellow)
        String BROWN = "\u001B[33m";

        for (int i = 0; i < 4; i++) {
            System.out.println(BROWN + stickLine + RESET);
        }
        System.out.println(BROWN + hookLine + RESET);
    }
}