/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathgame;
import java.lang.*;
import java.util.*;
/**
 *
 * @author devinbost
 */
public class Gamer {
    int _level = 0;
    int _score = 0;
    int _correctAnswerStreak = 0;
    int _totalCorrect = 0;
    int _totalWrong = 0;
    int _digits = 0;
    private String _username = "";
    private String _password;
    private QandABot _qAndABot;
    
    // When the game starts, the user will be prompted for the level. That level will be used to construct the Gamer object.
    public Gamer(int level, int digits){
        _level = level;
        _digits = digits;
    }
    public void LevelUp(){
        _level++;
    }
    public void ScoreUp(){
        _score++;
    }
    public int GetScore(){
        return _score;
    }
    public String GetName(){
        return _username;
    }
    public int GetLevel(){
        return _level;
    }
    
    // public function that returns high score.
    // high score should be returned as a double. The function should divide total
    // correct answers by the total questions answered.
    // // Gamer tracks the _score, which is the total number of correct answers.
    // // We need to be able to get the total questions asked. (This is tracked by the 
    // // this._qAndABot.GetTotalQuestionsAsked().)
    
    // User input will be passed through the UI to the gamer class. 
    
// The Login and Logout functions have been removed to reduce complexity of application.

//public void Login(String username, String password){
//    // login with QandABot
//    if(username == null){
//        throw new IllegalArgumentException("Error: The Gamer.Login(..) method cannot have a null valued username!");
//    }
//    if(password == null){
//        throw new IllegalArgumentException("Error: The Gamer.Login(..) method cannot have a null valued password!");
//    }
//    // We need to validate the password here with the AuthenticationBot singleton class.
//    _username = username;
//    _password = password;
//    
//    }
//public void Logout(){
//    // perform object disposal here
//    }
//}
// QandABot needs to be a singleton
}