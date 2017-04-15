package com.sslab.pokemon;

import com.sslab.pokemon.data.PokemonIndividualData;
import com.sslab.pokemon.data.PokemonSpeciesData;
import com.sslab.pokemon.data.PokemonValueData;
import com.sslab.pokemon.sprite.PokemonSprite;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jerry on 2017/3/19.
 */
public class PokeGen {
    private JComboBox speciesComboBox;
    private JPanel root;

    private JButton deleteButton;
    private JButton saveButton;

    private JPanel slot0;
    private JPanel slot1;
    private JPanel slot2;
    private JPanel slot3;
    private JPanel slot4;
    private JPanel slot5;
    private JTextField nickNameField;
    private JTextField hpField;
    private JTextField atkField;
    private JTextField defField;
    private JTextField spAtkField;
    private JTextField spDefField;
    private JTextField speedField;
    private JPanel currentSelectedPanel;
    private ArrayList<JTextField> statFields;

    Pokedex pokedex;
    HashMap<JPanel, PokemonIndividualData> pokemonMap;

    public PokeGen() {
        statFields = new ArrayList<>();
        statFields.add(hpField);
        statFields.add(atkField);
        statFields.add(defField);
        statFields.add(spAtkField);
        statFields.add(spDefField);
        statFields.add(speedField);

        pokemonMap=new HashMap<>();
        pokedex = new Pokedex("bin/pokemonData.json");

        currentSelectedPanel=slot0;
        currentSelectedPanel.setBorder(BorderFactory.createBevelBorder(0));

        speciesComboBox.addItem("-----------------------");
        for (int i = 0; i<pokedex.getPokemonSize();i++)
            speciesComboBox.addItem(Integer.toString(pokedex.getPokemonData(i).getId()) + ": " + pokedex.getPokemonData(i).getSpeciesName());

        speciesComboBox.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                //TODO update fields when select items in combobox
                int id = speciesComboBox.getSelectedIndex();
                if (id > 0) {
                    for (int i = 0; i < statFields.size(); i++) //show all other fields
                        statFields.get(i).setText(Integer.toString(pokedex.getPokemonData(id).getSpeciesValue().getValArray()[i]));
                    nickNameField.setText(pokedex.getPokemonData(id - 1).getSpeciesName());//Show name in nickname field

                    JLabel currentLabel = (JLabel) currentSelectedPanel.getComponent(0);
                    setPokemonIcon(id - 1, currentLabel);
                }//if
                else {
                    for ( int i=0;i<statFields.size();i++ ) statFields.get(i).setText("");
                    nickNameField.setText("");
                    JLabel currentLabel = (JLabel) currentSelectedPanel.getComponent(0);
                    currentLabel.setIcon(null);
                }//else
            }//actionPerformed
        });

        slot0.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                click(slot0);
            }//slot0
        });
        slot1.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                click(slot1);
            }//slot1
        });
        slot2.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                click(slot2);
            }//slot2
        });
        slot3.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                click(slot3);
            }//slot3
        });
        slot4.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                click(slot4);
            }//slot4
        });
        slot5.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                click(slot5);
            }//slot5
        });
        saveButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                setPokemon(currentSelectedPanel);
                pokemonMap.values().toArray();
                try {pokedex.saveFile("morris_new_pokemon.json");}
                catch (IOException exc){
                    exc.printStackTrace();
                }//catch
            }//saveButton
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                pokemonMap.remove(currentSelectedPanel);
                speciesComboBox.setSelectedIndex(0);
            }//deleteButton
        });
    }//PokeGen

    public void setPokemon(JPanel panel) {
        int id = speciesComboBox.getSelectedIndex();
        if (id>0){
            int[] array =new int [6];
            for (int i = 0; i<statFields.size(); i++)  array[i] = Integer.parseInt(statFields.get(i).getText());

            PokemonValueData valueArray = new PokemonValueData(array);
            //Save Pokemon in pokemonMap
            String nickName = nickNameField.getText();
            String specName = pokedex.getPokemonData(id -1).getSpeciesName();
            PokemonIndividualData newPoke = new PokemonIndividualData(nickName,id,valueArray);
            pokemonMap.put(panel,newPoke);
        }//if
    }//setPokemon

    public void loadPokemon(JPanel panel) {
        if ( pokemonMap.containsKey(panel) )  {
            PokemonIndividualData pokemon = pokemonMap.get(panel);
            speciesComboBox.setSelectedIndex(pokemon.getSpeciesID());
            int[] array = pokemon.getValues().getValArray();
            for (int i = 0; i < statFields.size(); i++) statFields.get(i).setText(Integer.toString(array[i]));
            nickNameField.setText(pokemon.getNickName());
        }
        else speciesComboBox.setSelectedIndex(0);
    }//loadPokemon

    private void setPokemonIcon(int id,JLabel label) {
        ImageIcon icon = new ImageIcon(PokemonSprite.getSprite(id));
        label.setIcon(icon);
    }//setPokemonIcon

    private void click(JPanel current)
    {
        if(pokemonMap.containsKey(currentSelectedPanel))
        {
            JLabel currentLabel = (JLabel) currentSelectedPanel.getComponent(0);
            setPokemonIcon(pokemonMap.get(currentSelectedPanel).getSpeciesID() - 1, currentLabel);
        }
        currentSelectedPanel.setBorder(BorderFactory.createEtchedBorder());
        currentSelectedPanel=current;
        currentSelectedPanel.setBorder(BorderFactory.createBevelBorder(1));
        loadPokemon(currentSelectedPanel);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PokeGen");
        frame.setContentPane(new PokeGen().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}