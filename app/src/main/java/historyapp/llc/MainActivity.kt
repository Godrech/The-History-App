package historyapp.llc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var ageEditText: EditText
    private lateinit var  clearButton: Button
    private lateinit var  generateButton: Button
    private lateinit var outputTextView: TextView





    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize
        ageEditText = findViewById(R.id.ageEditText)
        clearButton = findViewById(R.id.clearButton)
        generateButton = findViewById(R.id.generateButton)
        outputTextView = findViewById(R.id.outputTextView)

        generateButton.setOnClickListener {
            //create a variable of age to get a value from the user
            val age = ageEditText.text.toString().toIntOrNull()

            //if age is not null and age is between 20 and 100
            if (age != null && age in 20..100){
                val personName = when (age){
                    75-> {
                        "Joseph Stalin."+
                                "He was a Georgian revolutionary and Soviet political leader. He is known for basically being the USSR's dictator."
                    }
                    71-> {
                        "Vladmir Putin."+
                                "He is Russia's current President and has been since 2012,he is mostly known today as the person who invaded Ukraine for no reason. But that is what the west wants you to know. "
                    }
                    51-> {
                        "Napoleon Bonaparte."+
                                "He was a French military and political leader. He is known for being one of the best generals of the French revolutionary armies,also he was the French emperor of them from 1804-1814"
                    }
                    90-> {
                        "Fidel Castro."+
                                "He was a Cuban revolutionary, lawyer, and politician who was the leader of Cuba from 1959 to 2008. He was known for actively denying western influence from countries such as America"
                    }
                    48-> {
                        "Joseph Goebbels."+
                                "He was a German Nazi politician who the chief propagandist and glorified fanboy of The evil mustache man(Adolf Hitler). He was known for being a key member in spreading Nazi ideology and spreading the hatred of Jews"
                    }
                    69-> {
                        "Muammar Gaddafi."+
                                "He was a Libyan colonel, politician, and ideologist. He was known for his long and controversial rule over Libya."
                    }
                    74-> {
                        "Muhammad Ali."+
                                "He was an American professional boxer, activist, and philanthropist. He is mostly known for his boxing career and active advocation towards Black Activist groups who called for the end of racism in the US."
                    }
                    77-> {
                        "George W. Bush."+
                                "He was an American President from 2001 to 2009. He is mostly known for actively destabilizing the Middle East and waging war on and killing an unprecedented amount innocent Iraqi citizens."
                    }
                    85-> {
                        "Mohammad Mosaddegh."+
                                "He was an Iranian politician who served as the 35th Prime Minister of Iran. Until his government was overthrown in the 1953 Iranian coup d'etat orchestrated by the US's very own CIA. "
                    }
                    31-> {
                        "Steve Biko."+
                                "He was a South African anti-apartheid activist who fought for the termination of apartheid. He was best known for his role in the Black Consciousness Movement which aimed to empower Black South Africans"
                    }
                    else -> null
                }

                val message = if (personName!=null)"The Historical Figure is $personName"
                      else "No Historical Figure found with the entered age."
                outputTextView.text = message


            }else{
                outputTextView.text ="Entered age is invalid. Please enter a valid age between 20 and 100"
            }
        }

        clearButton.setOnClickListener{
            ageEditText.text.clear()
                outputTextView.text =""
        }
        }
}