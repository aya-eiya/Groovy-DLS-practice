Binding binding = new Binding([
                  move:new Robot().&move,
                  *:Direction.values()
                                .collectEntries{
                                  [(it.name()):it]
                                }
                  ])
GroovyShell shell = new GroovyShell(binding)
shell.evaluate(new File("RobotScript.groovy"))