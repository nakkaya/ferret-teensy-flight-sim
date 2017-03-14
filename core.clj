(defn update []
  "FlightSim.update();")

(defn enabled? []
  "__result = obj<boolean>(FlightSim.isEnabled());")

(defmacro float-ref [ref]
  (let [name (gensym)]
    `(do (~'native-declare ~(str "FlightSimFloat " name ";"))
         (~'cxx ~(str name " = XPlaneRef(\"" ref "\");"))
         (~'fn
           ([] ~(str "__result = obj<number>(" name ");"))
           ([~'x] ~(str name " = number::to<real_t>(x);"))))))

(defmacro integer-ref [ref]
  (let [name (gensym)]
    `(do (~'native-declare ~(str "FlightSimInteger " name ";"))
         (~'cxx ~(str name " = XPlaneRef(\"" ref "\");"))
         (~'fn
           ([] ~(str "__result = obj<number>(" name ");"))
           ([~'x] ~(str name " = number::to<number_t>(x);"))))))
