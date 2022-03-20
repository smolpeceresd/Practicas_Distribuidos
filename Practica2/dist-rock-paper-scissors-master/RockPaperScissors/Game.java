package RockPaperScissors;


/**
* RockPaperScissors/Game.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from RockPaperScissors.idl
* Thursday, April 2, 2015 7:44:39 PM IST
*/

public final class Game implements org.omg.CORBA.portable.IDLEntity
{

  //each game will have an ID that clients will use when making calls
  public int GameId = (int)0;

  //the move that the first client chose
  public String User1Move = null;

  //the move that the second client chose
  public String User2Move = null;

  //a game-specific timer, approx 5 seconds
  public int timer = (int)0;

  public Game ()
  {
  } // ctor

  public Game (int _GameId, String _User1Move, String _User2Move, int _timer)
  {
    GameId = _GameId;
    User1Move = _User1Move;
    User2Move = _User2Move;
    timer = _timer;
  } // ctor

} // class Game