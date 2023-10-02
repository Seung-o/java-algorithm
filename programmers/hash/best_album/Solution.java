package hash.best_album;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

class Genre implements Comparable<Genre> {
    public int totalPlayed;
    public TreeSet<Music> musics;

    public Genre() {
        this.totalPlayed = 0;
        this.musics = new TreeSet<>();
    }

    public void add(int totalPlayed, Music music) {
        this.totalPlayed += totalPlayed;
        this.musics.add(music);
    }

    @Override
    public int compareTo(Genre g) {
        if (this.totalPlayed > g.totalPlayed) return -1;
        else return 1;
    }
}

class Music implements Comparable<Music> {
    public int id;
    public int played;

    public Music(int id, int played) {
        this.id = id;
        this.played = played;
    }

    @Override
    public int compareTo(Music music) {
        if (this.played > music.played) return -1;
        else if (this.played < music.played) return 1;
        else {
            if (this.id > music.id) return 1;
            else return -1;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution main = new Solution();

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] answer = main.solution(genres, plays);
        for (int a : answer) System.out.print(a + " ");
    }

    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();

        TreeMap<String, Genre> tree = new TreeMap<>();

        for (int i = 0; i < genres.length; i++) {
            Genre genre = tree.getOrDefault(genres[i], new Genre());
            genre.add(plays[i], new Music(i, plays[i]));
            tree.put(genres[i], genre);
        }

        ArrayList<String> keyList = new ArrayList<>(tree.keySet());

        keyList.sort((k1, k2) -> tree.get(k1).compareTo(tree.get(k2)));

        for (String key : keyList) {
            Genre genre = tree.get(key);
            int count = 0;
            for (Music music : genre.musics) {
                if (count == 2) break;
                answer.add(music.id);
                count++;
            }
        }


        return answer.stream().mapToInt(Integer::intValue)
                .toArray();
    }
}