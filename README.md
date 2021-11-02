# Walking-App

### Introduction

Due to a car accident in 1997 my brother had to use a wheelchair for a few years. He was never able to walk properly again due to spasticity in his right arm and leg. I took him over to a rehabilitation clinic for patients with acquired head injury in Germany where he would relearn the common motor skills which he lacked. The therapy was pretty physical and required a lot of practice outwith the facility. As an engineer I observed that some of these practices could be made more efficient and automated with technology. My brother walks with a very distorted pattern due to reduced muscle control when placing the right foot. This leads to his whole foot making contact with the ground on every step he takes as well as it being curved inwards, which makes him to lean to his right side more than normal as shown in picture 1.

![Man Walking with Limp](https://raw.githubusercontent.com/ShaunHaldane/images/main/TerryWalking.png)                                            
Picture 1: My Brother Making a Distorted Step

In order to correct this deficiency, my brother needs to practice turning his right foot outwards and landing his heel on the ground before his toe for each step he takes. This is a lot easier said than done because he must pay attention to it constantly. The aim of the practice is to teach his muscle memory to adjust the foot accordingly when he walks. With any task that requires teaching muscle memory a lot of effort and practice is required. I would walk with my brother and correct his walking pattern every time he made a distorted step. After a while this became a source of argument for us and my brother would make wrong steps and just argue that he was doing it properly.

### The Solution

My brother needs to have it pointed out to him when he takes a distorted step and when he is walking correctly. Therefore I developed a sensor-based feedback system, that would measure and make him aware of his walking pattern by providing instant audio and visual feedback.
I attached two force sensing resistors to the inner soles of his right shoe as shown in picture 2.


![Sensors Attatched to Shoe Sole](https://raw.githubusercontent.com/ShaunHaldane/images/main/SensorsOnShoe.png)  
Picture 2: Force Sensing Resistors Attached to the Inner Sole of the Shoe.

The output of these sensors are read by an Arduino microcontroller which is attached to the side of the shoe as shown in picture 3.


![Equipment Attatched to Shoe](https://raw.githubusercontent.com/ShaunHaldane/images/main/ArduinoOnShoe.png)  
Picture 3: Arduino, Battery Pack and Bluetooth Module Attached to Shoe.

We already own a treadmill in our house so my brother could practice walking without depending on the weather and the risk of distractions. This also means that I could use a TV screen for the feedback system to warn my brother when he makes a distorted step. My initial thought was to use a beeping sound and make the product portable so it could be used outside but with the use of a TV I could make the sound louder and also give my brother visual feedback. I wired up a Bluetooth module to the Arduino so it could communicate wirelessly to a computer to give feedback. I have also used HTML, CSS and Javascript for the front-end so that the product could run in the browser and be used as a website, thereby it is portable and I can view his activity on another machine anywhere.

I used a python script to take input data from the Arduino and trigger key press events on the computer keyboard as shown in picture 4.


![Python Controller Code](https://raw.githubusercontent.com/ShaunHaldane/images/main/WalkingAppPythonCode.png)  
Picture 4: Python Controller

Javascript code shown in picture 5 is used to handle these key press events and change the display on the browser according to whether a distorted or a correct step was taken as shown in picture 6.


![Javascript Code to Handle Python Input](https://raw.githubusercontent.com/ShaunHaldane/images/main/WalkingAppJavascriptCode.png)  
Picture 5: Javascript Code to Handle Key Press Events.


![Game Screen](https://raw.githubusercontent.com/ShaunHaldane/images/main/WalkingAppSessionScreen.png)  
Picture 6: Good Step Graphic and Bad Step Graphic.


Correct steps and distorted steps are counted throughout the session and stored in a database along with session duration to compare with previous results. A session results screen is displayed at the end of the session showing the ratio of correct to incorrect steps along with a graph of previous correct to incorrect step ratios as shown in Picture 7 which displays the results taken over a month of effort.


![Results Screen](https://raw.githubusercontent.com/ShaunHaldane/images/main/WalkingAppResultsScreen.png)  
Picture 7: Session Results Screen

As seen from picture 7 the results were very sporadic. I cannot say if my brothers walking would improve with this equipment because he continues to make correct steps only when he is 100% focused on it and he has the motivation to do it. On some days he would get a good success rate and on others he wouldn't. Perhaps this equipment would work on my brother if used consistently over a much longer period of time.


### Conclusion

I built this product to try and improve my disabled brothers' walking ability.
Though the equipment did not show reliable results over a one-month period, the product could possibly be used to help patients with spasticity walk with less distortion if used for a longer period of time. Picture 8 shows my brother on the treadmill using the product.
