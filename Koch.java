/** Draws the Koch curve and the the Koch snowflake fractal. */
public class Koch {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); 
    	snowFlake(n);
		
	}

	/** Gets n, x1, y1, x2, y2,
     *  and draws a Koch curve of depth n from (x1,y1) to (x2,y2). */
	public static void curve(int n, double x1, double y1, double x2, double y2) {
		if (n == 0) {
        StdDraw.line(x1, y1, x2, y2); 
        return;
    	}
		double xa = x1 + (x2 - x1) / 3.0;
		double ya = y1 + (y2 - y1) / 3.0;
		double xb = x1 + 2.0 * (x2 - x1) / 3.0;
		double yb = y1 + 2.0 * (y2 - y1) / 3.0;
		double x3 = (Math.sqrt(3) / 6.0) * (y1 - y2) + 0.5 * (x1 + x2);
		double y3 = (Math.sqrt(3) / 6.0) * (x2 - x1) + 0.5 * (y1 + y2);
		curve(n - 1, x1, y1, xa, ya);
		curve(n - 1, xa, ya, x3, y3);
		curve(n - 1, x3, y3, xb, yb);
		curve(n - 1, xb, yb, x2, y2);
	}

    /** Gets n, and draws a Koch snowflake of n edges in the standard canvass. */
	public static void snowFlake(int n) {
		// A little tweak that makes the drawing look better
		StdDraw.setYscale(0, 1.1);
		StdDraw.setXscale(0, 1.1);
		curve(n, 0.1, 0.3, 0.5, 1.0);  
        curve(n, 0.5, 1.0, 0.9, 0.3); 
        curve(n, 0.9, 0.3, 0.1, 0.3); 
	}
}
