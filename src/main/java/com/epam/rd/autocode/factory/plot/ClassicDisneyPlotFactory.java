package com.epam.rd.autocode.factory.plot;

public class ClassicDisneyPlotFactory implements PlotFactory {
    private final String PLOT_TEXT;

    public ClassicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        this.PLOT_TEXT = String.format("%s is young and adorable. %s and %s love each other. %s interferes with" +
                " their happiness, but loses in the end.", hero.name(), hero.name(), beloved.name(), villain.name());
    }

    @Override
    public Plot plot() {
        return () -> PLOT_TEXT;
    }
}
