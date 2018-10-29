
package it.unibo.pps2017.client.controller.socialcontroller

import it.unibo.pps2017.client.controller.ActorController
import it.unibo.pps2017.commons.remote.social.PartyRole
import it.unibo.pps2017.commons.remote.social.SocialUtils.{FriendList, PlayerID, SocialMap}

/**
  * This trait is a mediator between the actor that handle the social
  * function of the system and the GUI.
  *
  */
trait SocialController extends ActorController {

  /**
    * Notify a API callback response to the GUI
    *
    * @param message the body of the response.
    */
  def notifyCallResultToGUI(message: Option[String]): Unit

  /**
    * Set the current online players map.
    *
    * @param onlinePlayers the list of current online players.
    */
  def setOnlinePlayerList(onlinePlayers: SocialMap): Unit

  /**
    * Notify an error to GUI
    *
    * @param throwable the error occurred.
    */
  def notifyErrorToGUI(throwable: Throwable): Unit

  /**
    * Send a remote request to register a new friend.
    *
    * @param friendId the ID of the player to register.
    */
  def registerNewFriend(friendId: PlayerID): Unit

  /**
    * Notify the GUI updates inside the party.
    *
    * @param currentPartyMap the party current state.
    */
  def updateParty(currentPartyMap: Map[PartyRole, PlayerID]): Unit

  /**
    * Execute a FoundGame call passing a paramMap.
    *
    * @param paramMap the parameters of the call to execute.
    */
  def executeFoundGameCall(paramMap: Map[String, String]): Unit

  /**
    * Update the current list of online players displayed on GUI.
    *
    * @param playerRefList the new onlinePlayer list to display.
    */
  def updateOnlinePlayerList(playerRefList: FriendList): Unit

  /**
    * Update the current list of online friends displayed on GUI.
    *
    * @param friendList the new friendList to display.
    */
  def updateOnlineFriendsList(friendList: FriendList): Unit
}
