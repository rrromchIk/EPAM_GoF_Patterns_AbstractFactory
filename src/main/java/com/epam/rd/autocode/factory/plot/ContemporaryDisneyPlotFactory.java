package com.epam.rd.autocode.factory.plot;

public class ContemporaryDisneyPlotFactory implements PlotFactory {
    private final String PLOT_TEXT;

    public ContemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.PLOT_TEXT = String.format("In the beginning, %s feels a bit awkward and uncomfortable." +
                " But personal issue fades, when a big trouble comes - %s. %s stands up against" +
                " it, but with no success at first. But then, by putting self together and with the help of friends," +
                " including spectacular, funny %s, %s restores the spirit, overcomes the crisis and gains gratitude" +
                " and respect.", hero.name(), epicCrisis.name(), hero.name(), funnyFriend.name(), hero.name());
    }

    @Override
    public Plot plot() {
        return () -> PLOT_TEXT;
    }
}
