Original App Design Project - README Template
===

# 

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
A social media application for college-wide clubs and organizations.

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** 
- **Mobile:**
- **Story:**
- **Market:**
- **Habit:**
- **Scope:**

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**
* User/club can register a new account
* User/club can login
* Club can make announcements
* User can personalize feed (follow clubs)
* User can view feed with posts from followed clubs

**Optional Nice-to-have Stories**
* Club can send a message to club members
* User can chat with clubs at their college
* Suggesting clubs for the user
* Users can chat with each other
* User can react to the announcement
* App can support multiple colleges

### 2. Screen Archetypes

* Register
   * User can create a student account
   * User can create a club account
* Login 
   * User can log in to a student account
   * User can log in to a club account
* Profile
    * User can view the list of clubs they follow
    * Clubs can view the list of club members
* Stream
    * User can view a feed of posts from the clubs that they follow 
* Detail
    * User can view details of a specific post 
* Chat (?)
    * User can message clubs they follow and vice versa
    * Clubs can message each other 
* Post
    * Clubs can create events 
    * Clubs can post updates

### 3. Navigation

**Tab Navigation** (Tab to Screen)

For users:
* Stream/Feed
* Profile


For Clubs:
* Post (for clubs)

**Flow Navigation** (Screen to Screen)

* Feed/Stream
   * Profile [club]
   * Chat 
* [list second screen here]
   * [list screen navigation here]
   * ...

## Wireframes
[Add picture of your hand sketched wireframes in this section]
<img src="YOUR_WIREFRAME_IMAGE_URL" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models

User
| Property | Type | Description |
| ------------- | -------- | ------------|
|username | String | unique id for user |
|password | String | unique password for user |
|profilePic | File | image for user profile |
|dateJoined | DateTime | date the user joined |
|clubsFollowed | Array | the clubs this user follows |
|bio | String | user self-description 


Club_User

| Property      | Type     | Description |
| ------------- | -------- | ------------|
| clubname      | String   | unique id for the club (default field) |
| password      | String   | unique password for the club |
| image         | File     | image that user posts |
| description       | String   | a description of the club |
| followes | Array   | an array of the users who follow this club |
| createdAt     | DateTime | date when post is created (default field) |


Post

 | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | author        | Pointer to User| image author |
   | image         | File     | image that user posts |
   | caption       | String   | image caption by author |
   | likesCount    | Number   | number of likes for the post |
   | createdAt     | DateTime | date when post is created (default field) |
   | updatedAt     | DateTime | date when post is last updated (default field) |
| rsvp_button     | boolean | a button that allows people to rsvp to an event |
    

Message

 | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the chat (default field) |
   | sender        | Pointer to Sender| message sender |
| recipient        | Pointer to recipient| message recipient |
   | content       | String   | message 
   | sentAt | DateTime | time message sent |
   |read | boolean | whether or not message opened |


### Networking




### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]