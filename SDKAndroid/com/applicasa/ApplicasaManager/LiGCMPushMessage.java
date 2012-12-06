package com.applicasa.ApplicasaManager;

import java.util.List;

import com.applicasa.User.User;

import applicasa.LiCore.Push.LiCallbackPush;
import applicasa.LiCore.Push.LiObjPushMessage;
import applicasa.LiJson.LiJSONException;
import applicasa.LiJson.LiJSONObject;

public class LiGCMPushMessage {

	private LiObjPushMessage message;
	
	public LiGCMPushMessage ()
	{
		message = new LiObjPushMessage();
	}
	
	/**
	 * Add Recipient
	 * @param user
	 */
	public void addReceipient(User user)
	{
		message.addReceipientUserIDList(user.UserID);
	}
	
	/**
	 * Add Recipients 
	 * @param user
	 */
	public void addReceipients(List<User> users)
	{
		message.addReceipients(users);
	}
	
	/**
	 * Set badge
	 * @param badge
	 */
	public void setBadge(int badge)
	{
		message.setBadge(badge);
	}
	
	/**
	 * Set the ringtone sound
	 * enter the file name of the ringtone
	 * @param sound
	 */
	public void setSound(String sound)
	{
		message.setSound(sound);
	}

	/**
	 * Set the extra tag of the message
	 * @param tag
	 */
	public void setTag(LiJSONObject tag)
	{
		message.setTag(tag);
	}
	
	/**
	 * add Tags
	 * @param key
	 * @param value
	 * @throws LiJSONException
	 */
	public void addTag(String key, String value) throws LiJSONException
	{
		message.addTag(key, value);
	}
	
	/**
	 * enter the message content
	 * @param meesage
	 */
	public void setMessage(String meesage)
	{
		message.setMSG(meesage);
	}
	
	/**
	 * Send push asynchronously result return via callbak
	 * @param liCallbackPush
	 */
	public void sendPush(LiCallbackPush liCallbackPush)
	{
		message.sendAsync(liCallbackPush);
	}
	
}
