/**
 *  Hozelock Cloud Control *
 *  Copyright April 2019 - Elliott Veares
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "Hozelock Cloud Control v1.0", namespace: "eveares", author: "Elliott Veares") 
    {
  	capability "Polling"
	capability "Actuator"
    capability "Switch"
    capability "Button"
    capability "Momentary"
    capability "Sensor"
    capability "Refresh"
    }

//Custom commands for custom tiles.
command "stop"
command "unpause"
command "pause"
command "unadjust"
command "adjust"
command "adjustdurationincrease"
command "adjustdurationdecrease"
command "adjustpercentincrease"
command "adjustpercentdecrease"
command "pausedurationincrease"
command "pausedurationdecrease"		 
command "waternow"
command "waterdurationincrease"
command "waterdurationdecrease"	
command "demomode"
command "normalmode"
command "resetall"


// tile definitions
	tiles {
	        standardTile("switch", "device.switch", width: 2, height: 2, canChangeIcon: true) {	
		  }
			
            standardTile("adjustdurationdecrease", "device.adjustdurationdecrease", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Adjustdurationdecrease", label: "Duration", action: "adjustdurationdecrease", icon: "st.custom.buttons.subtract-icon"
		  }
          
            valueTile("adjustdurationtile", "device.adjustdurationtile", width: 1, height: 1) {
			state "val", label:'${currentValue}', defaultState: true
	  	  }
          
          
            standardTile("adjustdurationincrease", "device.adjustdurationincrease", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Adjustdurationincrease", label: "Duration", action: "adjustdurationincrease", icon: "st.custom.buttons.add-icon"
		  }

            standardTile("adjustpercentdecrease", "device.adjustpercentdecrease", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Adjustpercentdecrease", label: "Amount", action: "adjustpercentdecrease", icon: "st.custom.buttons.subtract-icon"
		  }
          
            valueTile("adjustpercenttile", "device.adjustpercenttile", width: 1, height: 1) {
			state "val", label:'${currentValue}', defaultState: true
		  }
 
            standardTile("adjustpercentincrease", "device.adjustpercentincrease", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Adjustpercentincrease", label: "Amount", action: "adjustpercentincrease", icon: "st.custom.buttons.add-icon"
		  }
  
            standardTile("adjust", "device.adjust", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Adjust", label: "Adjust", action: "adjust", icon: "st.secondary.tools"
		  }
   
            standardTile("unadjust", "device.unadjust", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Unadjust", label: "Unadjust", action: "unadjust", icon: "st.secondary.refresh-icon"
		  }
   
            standardTile("pausedurationdecrease", "device.pausedurationdecrease", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "pausedurationdecrease", label: "Duration", action: "pausedurationdecrease", icon: "st.custom.buttons.subtract-icon"
		  }
          
            valueTile("pausedurationtile", "device.pausedurationtile", width: 1, height: 1) {
			state "val", label:'${currentValue}', defaultState: true
		  }
 
            standardTile("pausedurationincrease", "device.pausedurationincrease", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Pausedurationincrease", label: "Duration", action: "pausedurationincrease", icon: "st.custom.buttons.add-icon"
		  }
          
            standardTile("pause", "device.pause", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Pause", label: "Pause", action: "pause", icon: "st.sonos.pause-icon" 
		  }
        
            standardTile("unpause", "device.unpause", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Unpause", label: "Unpause", action: "unpause", icon: "st.sonos.play-icon" 
		  }
        
            standardTile("waterdurationdecrease", "device.waterdurationdecrease", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "waterdurationdecrease", label: "Duration", action: "waterdurationdecrease", icon: "st.custom.buttons.subtract-icon"
		  }
          
            valueTile("waterdurationtile", "device.waterdurationtile", width: 1, height: 1) {
			state "val", label:'${currentValue}', defaultState: true
		  }
 
            standardTile("waterdurationincrease", "device.waterdurationincrease", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "waterdurationincrease", label: "Duration", action: "waterdurationincrease", icon: "st.custom.buttons.add-icon"
		  }
                   
            standardTile("stop", "device.stop", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "Stop", label: "", action: "stop", icon: "st.sonos.stop-btn"
		  }
          
           standardTile("waternow", "device.waternow", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "WaterNow", label: "Water Now", action: "waternow", icon: "st.valves.water.open"
		  }
           
           standardTile("demomode", "device.demomode", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "demomode", label: "Demo Mode", action: "demomode", icon: "st.unknown.thing.thing-circle" 
		  }
           standardTile("resetall", "device.resetall", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "resetall", label: 'Reset All', action: "resetall", icon: "st.samsung.da.washer_ic_cancel" 
		  }
           standardTile("normalmode", "device.normalmode", width: 1, height: 1,  decoration: "flat", canChangeIcon: true) {
			state "normalmode", label: "Normal Mode", action: "normalmode", icon: "st.sonos.play-icon" 
		  }
           
     		valueTile("Text1", "device.Text1", width: 3, height: 1) {
       
        	state "val", label:"On Demand Watering", defaultState: true
			
		  }
        	valueTile("Text2", "device.Text2", width: 3, height: 1) {
       
        	state "val", label:"Schedule Control", defaultState: true
			
		  }
        	valueTile("Text3", "device.Text3", width: 3, height: 1) {
           
          	state "val", label:"Pause Watering", defaultState: true
			
		  }
         	valueTile("Text4", "device.Text4", width: 3, height: 1, decoration: "flat") {
       
        	state "val", label:"Live Status", defaultState: true
		  }
            
            valueTile("Text5", "device.Text5", width: 3, height: 1) {
       
        	state "val", label:"Other", defaultState: true
		  }
          
            valueTile("iswateringtext", "device.iswateringtext", width: 1, height: 1) {
			state "val", label:"Currently Watering", defaultState: true
		  }
          
            valueTile("isadjustedtext", "device.isadjustedtext", width: 1, height: 1) {
			state "val", label:"Currently Adjusted", defaultState: true
		  }
          
          valueTile("ispausedtext", "device.ispausedtext", width: 1, height: 1) {
			state "val", label:"Currently Paused", defaultState: true
		  }
          
           valueTile("siginalstatustext", "device.siginalstatustext", width: 1, height: 1) {
			state "val", label:"Siginal Status", defaultState: true
		  }
          
           valueTile("battreystatustext", "device.battreystatustext", width: 1, height: 1) {
			state "val", label:"Battery Status", defaultState: true
		  }
          
           valueTile("childlocktext", "device.childlocktext", width: 1, height: 1) {
			state "val", label:"Child Lock", defaultState: true
          
		  } 
           	valueTile("isUresponsivetext", "device.isUresponsivetext", width: 1, height: 1) {
			state "val", label:"System Health", defaultState: true    
		  }
          
           valueTile("panelremovedtext", "device.panelremovedtext", width: 1, height: 1) {
			state "val", label:"Panel Removed", defaultState: true
		  }
            valueTile("iswateringvalue", "device.iswateringvalue", width: 2, height: 1) {
			state "val", label: '${currentValue}', defaultState: true
		  }
   
            valueTile("isadjustedvalue", "device.isadjustedvalue", width: 2, height: 1) {
			state "val", label: '${currentValue}', defaultState: true
		  }
   
            valueTile("ispausedvalue", "device.ispausedvalue", width: 2, height: 1) {
			state "val", label: '${currentValue}', defaultState: true
		  }
          
            valueTile("batterystatusvalue", "device.batterystatusvalue", width: 2, height: 1) {
			state "val", label: '${currentValue}', defaultState: true
		  }
   
             valueTile("siginalstatusvalue", "device.siginalstatusvalue", width: 2, height: 1) {
			state "val", label:'${currentValue}', defaultState: true
		  }
          
            valueTile("childlockvalue", "device.childlockvalue", width: 2, height: 1) {
			state "val", label: '${currentValue}', defaultState: true
		  }
          
              valueTile("isUresponsivevalue", "device.isUresponsivevalue", width: 2, height: 1) {
			state "val", label: '${currentValue}', defaultState: true
		  }
         
            valueTile("panelremovedvalue", "device.panelremovedvalue", width: 2, height: 1) {
			state "val", label: '${currentValue}', defaultState: true
		  } 
         	 valueTile("blank1", "device.blank1", width: 1, height: 1) {
			state "val", label:"", defaultState: true
		  }
           
           valueTile("blank1", "device.blank1", width: 1, height: 1) {
			state "val", label:"", defaultState: true
		  }
           valueTile("blank2", "device.blank2", width: 1, height: 1) {
			state "val", label:"", defaultState: true
		  }
   		   valueTile("blank3", "device.blank3", width: 1, height: 1) {
			state "val", label:"", defaultState: true
		  }
   		   valueTile("blank4", "device.blank4", width: 1, height: 1) {
			state "val", label:"", defaultState: true
		  }
            
		main (["switch","text"])
		details ([ "Text1","waterdurationdecrease","waterdurationtile","waterdurationincrease","waternow","blank1","stop","Text2","adjustpercentdecrease","adjustpercenttile",
        "adjustpercentincrease","adjustdurationdecrease","adjustdurationtile","adjustdurationincrease","adjust","blank2",
        "unadjust","Text3","pausedurationdecrease","pausedurationtile","pausedurationincrease","pause","blank3","unpause","Text4","iswateringtext","iswateringvalue",
        "isadjustedtext","isadjustedvalue","ispausedtext","ispausedvalue","battreystatustext","batterystatusvalue",
        "siginalstatustext","siginalstatusvalue","isUresponsivetext","isUresponsivevalue","panelremovedtext","panelremovedvalue","childlocktext","childlockvalue",
        "Text5","normalmode","resetall","demomode"])
	}


preferences {
    
        input name: "HubID", type: "text", title: "Hub ID", description: "Enter Your 6 Digit Hub ID", required: true
		input name: "ControllerID", type: "text", title: "Controller ID", description: "Enter The Controller ID , 0 = First Controller", required: true
}
}

//Initial setup stuff
def installed()
{
initialize()
}

def initialize()
{
state.adjust_duration = 0
state.adjust_percentage = 0
state.pause_duration = 0
state.water_duration = 0
state.water_duration_friendly = 0
sendEvent(name: "adjustdurationtile",value: state.adjust_duration +  "  Days")
sendEvent(name: "adjustpercenttile", value: state.adjust_percentage +  "%")
sendEvent(name: "pausedurationtile", value: state.pause_duration +  "  Days")
sendEvent(name: "waterdurationtile", value: state.water_duration_friendly +  "  Minutes")
updateStatus()
}

//The "Reset All" button
def resetall()
{
state.adjust_duration = 0
state.adjust_percentage = 0
state.pause_duration = 0
state.water_duration = 0
state.water_duration_friendly = 0
sendEvent(name: "adjustdurationtile",value: state.adjust_duration +  "  Days")
sendEvent(name: "adjustpercenttile", value: state.adjust_percentage +  "%")
sendEvent(name: "pausedurationtile", value: state.pause_duration +  "  Days")
sendEvent(name: "waterdurationtile", value: state.water_duration_friendly +  "  Minutes")
unschedule()
updateStatus()
updateStatusNow()
}

//Live updating of status tiles.
def updateStatus() {
unschedule()
runEvery1Minute(batterystatus)
runEvery1Minute(signalstatus)
runEvery1Minute(childlockstatus)
runEvery1Minute(iswateringstatus)
runEvery1Minute(ispanelremovedstatus)
runEvery1Minute(isadjustedstatus)
runEvery1Minute(ispausedstatus)
runEvery1Minute(isUresponsive)
}
 
//On demand updating of status tiles. 
def updateStatusNow()

{
batterystatus()
signalstatus()
childlockstatus()
iswateringstatus()
ispanelremovedstatus()
isadjustedstatus()
ispausedstatus()
isUresponsive()
}

//Adjustment Controlls

def adjustdurationincrease() {
 	state.adjust_duration = state.adjust_duration + 1
    if (state.adjust_duration > 31)
    {state.adjust_duration = 31}
    sendEvent(name: "adjustdurationtile", value: state.adjust_duration +  "  Days")
    updateStatusNow()
}

def adjustdurationdecrease() {
	state.adjust_duration = state.adjust_duration - 1
    if (state.adjust_duration < 1)
    {state.adjust_duration = 1}
    sendEvent(name: "adjustdurationtile", value: state.adjust_duration + "  Days")
    updateStatusNow()
}

def adjustpercentincrease() {
	state.adjust_percentage = state.adjust_percentage + 25
    if (state.adjust_percentage > 100)
    {state.adjust_percentage = 100}
    sendEvent(name: "adjustpercenttile", value: state.adjust_percentage +  "%")
    updateStatusNow()
}

def adjustpercentdecrease() {
	state.adjust_percentage = state.adjust_percentage - 25
    if (state.adjust_percentage < -100)
    {state.adjust_percentage = -100}
    sendEvent(name: "adjustpercenttile", value: state.adjust_percentage + "%")
    updateStatusNow()
}

def pausedurationincrease() {
	state.pause_duration = state.pause_duration + 1
    if (state.pause_duration > 31)
    {state.pause_duration = 31}
    sendEvent(name: "pausedurationtile", value: state.pause_duration +  "  Days")
    updateStatusNow()
}

def pausedurationdecrease() {
	state.pause_duration = state.pause_duration - 1
    if (state.pause_duration < 1)
    {state.pause_duration = 1}
    sendEvent(name: "pausedurationtile", value: state.pause_duration + "  Days")
    updateStatusNow()
}

def waterdurationincrease() {
 	state.water_duration = state.water_duration + 60000
    if (state.water_duration > 7200000)
    {state.water_duration = 7200000}
	state.water_duration_friendly = state.water_duration / 60000
    sendEvent(name: "waterdurationtile", value: state.water_duration_friendly +  "  Minutes")
    updateStatusNow()
}

def waterdurationdecrease() {
	state.water_duration = state.water_duration - 60000
    if (state.water_duration < 60000)
    {state.water_duration = 60000}
	state.water_duration_friendly = state.water_duration / 60000
    sendEvent(name: "waterdurationtile", value: state.water_duration_friendly + "  Minutes")
    updateStatusNow()
}


def parse(String description) {
	//log.error "This device does not support incoming events"
	return null
}



//Code to unpause and resume watering schedule
def unpause() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/actions/unpause",
    body: [duration: ""]
]

try {
    httpPostJson(params) { resp ->
        resp.headers.each {
           
        }
        
    }
} catch (e) {
    log.debug "something went wrong: $e"
}
updateStatusNow()
}


//Code to pause watering schedule
def pause() {

def params1 = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/actions/unpause",
    body: [duration: ""]
]

try {
    httpPostJson(params1) { resp ->
        resp.headers.each {
           
        }
        
    }
} catch (e) {
    log.debug "something went wrong: $e"
}

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/actions/pause",
    body: [duration: state.pause_duration]
]

try {
    httpPostJson(params) { resp ->
        resp.headers.each {
           
        }
       
    }
} catch (e) {
    log.debug "something went wrong: $e"
}
updateStatusNow()
}

//Code to unadjust watering schedule
def unadjust() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/actions/unadjust",
    body: [duration: "", wateringAdjustment: ""]
]

try {
    httpPostJson(params) { resp ->
        resp.headers.each {
           
        }
      
    }
} catch (e) {
    log.debug "something went wrong: $e"
}
updateStatusNow()
}

//Code to adjust watering schedule
def adjust() {

def params1 = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/actions/unadjust",
    body: [duration: "", wateringAdjustment: ""]
]

try {
    httpPostJson(params1) { resp ->
        resp.headers.each {
            
        }
       
    }
} catch (e) {
    log.debug "something went wrong: $e"
}

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/actions/adjust",
    body: [duration: state.adjust_duration, wateringAdjustment: state.adjust_percentage]
]

try {
    httpPostJson(params) { resp ->
        resp.headers.each {
            
        }
        
    }
} catch (e) {
    log.debug "something went wrong: $e"
}
updateStatusNow()
}

//Code to stop current watering
def stop() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/actions/stopWatering",
    body: [duration: ""]
]

try {
    httpPostJson(params) { resp ->
        resp.headers.each {
            
        }
      
    }
} catch (e) {
    log.debug "something went wrong: $e"
}
updateStatusNow()
}

//Code to water on demand
def waternow() {

def params1 = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/actions/stopWatering",
    body: [duration: ""]
]

try {
    httpPostJson(params1) { resp ->
        resp.headers.each {
            
        }
      
    }
} catch (e) {
    log.debug "something went wrong: $e"
}


def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/actions/waterNow",
    body: [duration: state.water_duration]
]

try {
    httpPostJson(params) { resp ->
        resp.headers.each {
           
        }
       
    }
} catch (e) {
    log.debug "something went wrong: $e"
}
updateStatusNow()
}

//Code to set Demo Mode
def demomode() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/actions/setMode",
    body: [mode: "demo"]
]

try {
    httpPostJson(params) { resp ->
        resp.headers.each {
            
        }
       
    }
} catch (e) {
    log.debug "something went wrong: $e"
}
updateStatusNow()
}

//Code to set Normal Mode
def normalmode() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/actions/setMode",
    body: [mode: "normal"]
]

try {
    httpPostJson(params) { resp ->
        resp.headers.each {
      
        }
       
    }
} catch (e) {
    log.debug "something went wrong: $e"
}
updateStatusNow()
}




//Code to get siginal strenth status.
def signalstatus() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/",
    contentType: 'application/json'
    ]

try {
    httpGet(params) { resp ->
        resp.headers.each {
     
    }
 
   sendEvent(name: "siginalstatusvalue", value: "$resp.data.controller.signalStrength")
    }
} catch (e) {
    //log.error "something went wrong: $e"
}
}




//Code to get battery status.
def batterystatus() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/",
    contentType: 'application/json'    
    ]

try {
    httpGet(params) { resp ->
        resp.headers.each {
       
    }
 
   sendEvent(name: "batterystatusvalue", value: "$resp.data.controller.batteryStatus")

    }
} catch (e) {
    //log.error "something went wrong: $e"
}
}



//Code to get watering status.
def iswateringstatus() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/",
    contentType: 'application/json'    
    ]

try {
    httpGet(params) { resp ->
        resp.headers.each {
       
    }
   if ("$resp.data.controller.isWatering"=="true")
  {
  state.isWateringfriendly="Yes"
  }
   else
  {
  state.isWateringfriendly="No"
  }
  sendEvent(name: "iswateringvalue", value: state.isWateringfriendly)

    }
} catch (e) {
    //log.error "something went wrong: $e"
}
}


//Code to get adjusted status.
def isadjustedstatus() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/",
    contentType: 'application/json'    
    ]

try {
    httpGet(params) { resp ->
        resp.headers.each {
       
    }
  if ("$resp.data.controller.isAdjusted"=="true")
  {
  state.isAdjustedfriendly="Yes"
  }
   else
  {
  state.isAdjustedfriendly="No"
  }
   sendEvent(name: "isadjustedvalue", value: state.isAdjustedfriendly)

    }
} catch (e) {
    //log.error "something went wrong: $e"
}
}



//Code to get paused status.
def ispausedstatus() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/",
    contentType: 'application/json'    
    ]

try {
    httpGet(params) { resp ->
        resp.headers.each {
       
    }
      
  if ("$resp.data.controller.isPaused"=="true") 
  {
  state.isPausedfriendly="Yes"
  }
  else
 {
  state.isPausedfriendly="No"
 }
  sendEvent(name: "ispausedvalue", value: state.isPausedfriendly)

    }
} catch (e) {
    //log.error "something went wrong: $e"
}
}


//Code to get front panel status.
def ispanelremovedstatus() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/",
    contentType: 'application/json'    
    ]

try {
    httpGet(params) { resp ->
        resp.headers.each {
       
    } 
 if ("$resp.data.controller.isPanelRemoved"=="true")
  {
  state.isPanelRemovedfriendly="Yes"
  }
  else
  {
 state.isPanelRemovedfriendly="No"
 }
 sendEvent(name: "panelremovedvalue", value: state.isPanelRemovedfriendly)

    }
} catch (e) {
    //log.error "something went wrong: $e"
}
}


//Code to get child lock status.
def childlockstatus() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/controllers/$ControllerID/",
    contentType: 'application/json'    
    ]

try {
    httpGet(params) { resp ->
        resp.headers.each {
       
    }
  if ("$resp.data.controller.isChildlockEnabled"=="true")
  {
  state.isChildlockEnabledfriendly="Enabled"
  }
  else
  {
  state.isChildlockEnabledfriendly="Disabled"
  }
  
   sendEvent(name: "childlockvalue", value: state.isChildlockEnabledfriendly)

    }
} catch (e) {
    //log.error "something went wrong: $e"
}

}


//Code to get general system status
def isUresponsive() {

def params = [
    uri: "http://hoz3.com/restful/foo/hubs/$HubID/",
    contentType: 'application/json'    
    ]

try {
    httpGet(params) { resp ->
        resp.headers.each {
       
    }
  if ("$resp.data.hub.isUresponsive"=="true")
  {
  state.isUresponsivefriendly="Unresponsive"
  }
  else
  {
  state.isUresponsivefriendly="OK"
  }
  
   sendEvent(name: "isUresponsivevalue", value: state.isUresponsivefriendly)

    }
} catch (e) {
    //log.error "something went wrong: $e"
}

}

//End of Device Handler.
