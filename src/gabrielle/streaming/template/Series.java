package gabrielle.streaming.template;

public class Series extends Title {

    private int seasons;
    private int episodes;
    private boolean finished;
    private int episodesLength;

    public Series(String title, int releaseYear) {
        super(title, releaseYear);
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    public void setEpisodesLength(int episodesLength) {
        this.episodesLength = episodesLength;
    }

    public int getSeasons() {
        return seasons;
    }
    public int getEpisodes() {
        return episodes;
    }
    public boolean isFinished() {
        return finished;
    }
    public int getEpisodesLength() {
        return episodesLength;
    }

    @Override
    public int getLength(){
        return seasons*episodes*episodesLength/60;
    }

}
