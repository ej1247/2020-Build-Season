TEAM 6372 programming strategy

working on one project of any scale requires segmentation of some kind.
Within a FRC team I have noticed that this segmentation comes in the form of seperating out teams or departments of people. 
I have noticed that each team has their own goal they want/need to accheive because of this our programming team works closely but seperates itself as much as we can from out build team. In doing so we have a drive station setup for the build team with the current working code and a seprate test robot (the last years robot) that we can test features and functionality. 

Now that we have establshed our base philosophy here is how we adapted our code work flow to match 


Git workflow
------------
master competition branch (final branch that all the working code gets thrown into) ex: master

- master feature branch () ex: color-sensor
-- sub feature branch  ex: finkegabriel/color-sensor

because our work flows are segementated like this it gives us the power to add some saftey into our testing phases for when the build team wants to test something

for example lets say the build team just needs to test some motor. We allocate a port with the functionailty they request and then run a deploy command that may look like `./gradlew some-motor` we have eddited our buid.gradle file to accept command flags for every sub system we have programmed and checks out into the feature branch that supports the functionailty the requsted. In the future we want this to be a json file that we can turn on and off systems for every deploy.

