
public class Solution {
    double radius;
    double xCentre;
    double yCentre;

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.xCentre = x_center;
        this.yCentre = y_center;
    }

    public double[] randPoint() {
        double randomRadius = Math.sqrt(Math.random()) * radius;
        double angle = Math.random() * 2 * Math.PI;
        double x = xCentre + randomRadius * Math.cos(angle);
        double y = yCentre + randomRadius * Math.sin(angle);
        return new double[]{x, y};
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */