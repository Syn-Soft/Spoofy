# Spoofy (Gonna change that name probably)
A spotify clone with the intention of generating more money for bands and less for our pockets.

# About
The goal of this program is to challenge Spotify's near monopoly and extortion of musicians by being a competitor that pays more to the artists who make the platform possible.

# Model
The model will be quite simple.  Over the course of a month, listening duration will be calculated per person, as well as the time spent listening to each artist.  For each artist, a proportion of listening time will be calculated and the amount the artist recieves will be that persons contribution for that month minus the necessary costs for the app to function all multiplied by the artists listening proportion.  For free accounts, ad revenue will need to be calculated as part of the persons monthly contribution, and this could simply be calculated as the total ad revenue minus the number of free accounts (2).  A more complex model could use the time spent listening over total second spent listening (across all free users) times the total ad revenue.

##### Equation 1: 
<b>Calculating a users contribution to an artist for that month.</b>
<p align="center">
<img src="https://render.githubusercontent.com/render/math?math=\Large{\frac{t_\alpha}{T}\cdot \left(X-C\right)}\hspace{13mm}\color{white}{\frac{t_\alpha}{T}\cdot \left(X-C\right)}"></p>
Where <i>t<sub>&alpha;</sub></i> is the time spent listening to the artist, <i>T</i> is the total time spent listening <i>X</i> is the monetary income contibution of that user, and <i>C</i> is the apps necessary functioning costs for that month (or really, next month technically)


##### Equation 2:
<b>Calculating a free users monetary income contribution for that month based on ad revenue.</b>
<p align="center">
<img src="https://render.githubusercontent.com/render/math?math=\Large{\frac{A-C}{N}}\hspace{13mm}\color{white}{\frac{A-C}{N}}"></p>
Where <i>A</i> is this months ad revenue, N is the number of free users, and <i>C</i> is the apps necessary functioning costs for that month.

# Main features
* Music Streaming
* Accounts
* Playlists
* Discovery

# Auxillary Features
* Multi-device integration
* Merch sales
* ?

# Devices (By preference)
* Mobile
* Web 
* PC
Why web < pc?  PC is OS specific, browser is not.  Why mobile<web?  Mobile is a more common listening platform than the others.

# UI Design
This app should emulate the look and feel of Spotify, to ensure users can easily switch between the two apps.  Colors will likely need to be different.

### Colors
Currently, here are the colors I've selected to build the UI around:

![#282828](https://via.placeholder.com/15/282828/000000?text=+) `#282828`
![#877BD3](https://via.placeholder.com/15/877BD3/000000?text=+) `#877BD3`
![#991212](https://via.placeholder.com/15/991212/000000?text=+) `#991212`
![#efefef](https://via.placeholder.com/15/efefef/000000?text=+) `#efefef`

Might want to drop the red, but it fits with the syn-soft style

# Partnerships
We may want to interact with existing companies/orgs that offer similar services on a different level.  For example, bandcamp has historically been quite supportive of and fair to artists, so they could do a great deal of the hosting for our platform.  With the bandcamp partnership, we could link people to artists bandcamp page, and for any "download for offline" features could be made to a seco.  Ampled is another organization to look at partnering with.

# Account levels
* Free - Operates like spotify's free account, but more usable, and more ads probably.
* Basic - Operates like Spotfy's premium account.  Downloading for offline for paid records on bandcamp (if we go that route), would require that user to pay for the album through bandcamp.
* Premium - Allows for extra features, like the full download for offline option for non-free records on bandcamp.
