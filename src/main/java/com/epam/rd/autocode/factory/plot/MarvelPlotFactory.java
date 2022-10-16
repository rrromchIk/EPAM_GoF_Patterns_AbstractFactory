package com.epam.rd.autocode.factory.plot;

public class MarvelPlotFactory implements PlotFactory{
    private final String PLOT_TEXT;

    public MarvelPlotFactory(Character[] hero, EpicCrisis epicCrisis, Character villain) {
        this.PLOT_TEXT = writePlot(hero, epicCrisis, villain);
    }

    private String writePlot(Character[] hero, EpicCrisis epicCrisis, Character villain) {
        boolean plural = hero.length > 1;
        StringBuilder characters = new StringBuilder();

        for(int i = 0; i < hero.length; ++i) {
            if(i == hero.length - 1 && plural) {
                characters.append(" and " + String.format("the brave %s", hero[i].name()));
                break;
            } else {
                characters.append(String.format("the brave %s", hero[i].name()));
            }
            if(plural && i != hero.length - 2) characters.append(", ");
        }

        String firstPart = String.format("%s threatens the world. ", epicCrisis.name());
        String secondPart = String.format("But %s %s on guard. ", characters, plural ? "are" : "is");
        String thirdPart = String.format("So, no way that intrigues of %s will bend the willpower of %s.",
                villain.name(), plural ? "inflexible heroes" : "the inflexible hero");
        return firstPart + secondPart + thirdPart;
    }

    @Override
    public Plot plot() {
        return () -> PLOT_TEXT;
    }
}
