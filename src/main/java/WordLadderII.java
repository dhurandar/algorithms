import java.util.ArrayList;
import java.util.List;

/**
 * Created by rsingh13.
 *
 *  Given two words (beginWord and endWord), and a dictionary's word list,
 *  find all shortest transformation sequence(s) from beginWord to endWord, such that:

 Only one letter can be changed at a time
 Each transformed word must exist in the word list. Note that beginWord is not a transformed word.

 For example,

 Given:
 beginWord = "hit"
 endWord = "cog"
 wordList = ["hot","dot","dog","lot","log","cog"]

 Return

 [
 ["hit","hot","dot","dog","cog"],
 ["hit","hot","lot","log","cog"]
 ]

 Note:

 Return an empty list if there is no such transformation sequence.
 All words have the same length.
 All words contain only lowercase alphabetic characters.
 You may assume no duplicates in the word list.
 You may assume beginWord and endWord are non-empty and are not the same.


 */
public class WordLadderII {

    public static void main(String args[]) {

     new WordLadderII().convertWord("hit","cog",new String[]{"hot","dot","dog","lot","log","cog"});

    }

    private List<String> convertWord(String hit, String cog, String[] strings) {
        Object wordGraph;

        if(strings != null && strings.length >0 )
            wordGraph  = createGraph(strings);

        List<String> result = new ArrayList<String>();
        if(hit == null) {
            result.add( cog );
            return result;
        }

        if(hit == cog || hit.equals( cog )) {
            return result;
        }

        if(editDistance( hit,cog ) <= 1) {
            result.add( cog );
            return result;
        }

        //find what you achieve in the input array by 1 shift or operations , either delete , insert or add.
        //search the list for words with 1 change.


        return result;
    }

    private Object createGraph(String[] strings) {
    }

    private int editDistance(String s1,String s2) {



        return 0;

    }
}
