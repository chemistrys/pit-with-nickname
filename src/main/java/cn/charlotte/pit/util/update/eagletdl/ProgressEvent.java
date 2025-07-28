package cn.charlotte.pit.util.update.eagletdl;

import java.text.DecimalFormat;

public class ProgressEvent {

    private final long speed;
    private final EagletTask task;
    private final double percentage;

    ProgressEvent(long speed, EagletTask task, double percentage) {
        this.speed = speed;
        this.task = task;
        this.percentage = percentage;
    }

    private static String formatDouble(double d) {
        return new DecimalFormat("0.00").format(d);
    }

    public static String format(long l) {
        if (l < 1024) return l + " B";
        if (l < 1024 * 1024) return formatDouble((double) l / 1024D) + " KiB";
        if (l < 1024 * 1024 * 1024) return formatDouble((double) l / (1024D * 1024D)) + " MiB";
        if (l < 1024 * 1024 * 1024 * 1024L) return formatDouble((double) l / (1024D * 1024D * 1024)) + " GiB";
        return "";
    }

    public EagletTask getTask() {
        return task;
    }

    public long getSpeed() {
        return speed;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getPercentageFormatted() {
        return formatDouble(percentage * 100D) + " %";
    }

    /**
     * Get the speed with format like <code>X.00 MiB</code>, <code>Y.50 GiB</code>, etc.
     *
     * @return formatted speed string
     */
    public String getSpeedFormatted() {
        return format(getSpeed());
    }
}
