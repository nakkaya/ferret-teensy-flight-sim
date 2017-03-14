ferret-teensy-flight-sim
===============

Ferret wrapper for Teensy flight sim controls.

#### Usage

Follow installation instructions in https://www.pjrc.com/teensy/td_flightsim.html

#### API

    (require '[ferret-teensy-flight-sim.core :as xp])

    ;; Update
    (xp/update)

    ;; Read
    (def  latitude    (xp/float-ref "sim/flightmodel/position/latitude"))
    (def  longitude   (xp/float-ref "sim/flightmodel/position/longitude"))

    (defn loc []      (list (latitude) (longitude)))

    ;; Write
    (def roll!   (xp/float-ref "sim/cockpit2/controls/yoke_roll_ratio"))
    (roll! 1)