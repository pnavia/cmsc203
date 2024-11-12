package Assignment4;

public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;

    // Default constructor
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    // Parameterized constructor
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    // Copy constructor
    public Plot(Plot plot) {
        this(plot.x, plot.y, plot.width, plot.depth);
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean overlaps(Plot plot) {
        // Basic overlap logic; this may need adjustment depending on specifications.
        return !(plot.x >= this.x + this.width || plot.x + plot.width <= this.x || 
                 plot.y >= this.y + this.depth || plot.y + plot.depth <= this.y);
    }

    public boolean encompasses(Plot plot) {
        // Basic encompass logic; this may need adjustment based on specifications.
        return (plot.x >= this.x && plot.y >= this.y && 
                plot.x + plot.width <= this.x + this.width &&
                plot.y + plot.depth <= this.y + this.depth);
    }

    @Override
    public String toString() {
        return "Plot [x=" + x + ", y=" + y + ", width=" + width + ", depth=" + depth + "]";
    }
}

