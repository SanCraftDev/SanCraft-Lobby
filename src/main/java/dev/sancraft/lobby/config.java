package dev.sancraft.lobby;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.properties.BooleanProperty;
import ch.jalu.configme.properties.IntegerProperty;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;

public class config implements SettingsHolder {
    //Navbar
    //Slot One
    public static final Property<Boolean> NAVBAR_ONE_ENABLED =
            new BooleanProperty("navbar.one.enabled", false);
    public static final Property<String> NAVBAR_ONE_TYPE =
            new StringProperty("navbar.one.type", "");
    public static final Property<String> NAVBAR_ONE_NAME =
            new StringProperty("navbar.one.name", "");
    public static final Property<String> NAVBAR_ONE_SKULL =
            new StringProperty("navbar.one.skull", "");
    public static final Property<Integer> NAVBAR_ONE_X =
            new IntegerProperty("navbar.one.x", 0);
    public static final Property<Integer> NAVBAR_ONE_Y =
            new IntegerProperty("navbar.one.y", 0);
    public static final Property<Integer> NAVBAR_ONE_Z =
            new IntegerProperty("navbar.one.z", 0);
    public static final Property<Integer> NAVBAR_ONE_PITCH =
            new IntegerProperty("navbar.one.pitch", 0);
    public static final Property<Integer> NAVBAR_ONE_YAW =
            new IntegerProperty("navbar.one.yaw", 0);
    public static final Property<String> NAVBAR_ONE_COMMAND =
            new StringProperty("navbar.one.command", "");
    public static final Property<String> NAVBAR_ONE_SERVER =
            new StringProperty("navbar.one.server", "");
    public static final Property<Integer> NAVBAR_ONE_PORT =
            new IntegerProperty("navbar.one.port", 0);
    public static final Property<String> NAVBAR_ONE_MESSAGE =
            new StringProperty("navbar.one.message", "");
    public static final Property<String> NAVBAR_ONE_RIGHT_CLICK =
            new StringProperty("navbar.one.right-click", "");
    public static final Property<String> NAVBAR_ONE_LEFT_CLICK =
            new StringProperty("navbar.one.left-click", "");
    //Slot Two
    public static final Property<Boolean> NAVBAR_TWO_ENABLED =
            new BooleanProperty("navbar.two.enabled", false);
    public static final Property<String> NAVBAR_TWO_TYPE =
            new StringProperty("navbar.two.type", "");
    public static final Property<String> NAVBAR_TWO_NAME =
            new StringProperty("navbar.two.name", "");
    public static final Property<String> NAVBAR_TWO_SKULL =
            new StringProperty("navbar.two.skull", "");
    public static final Property<Integer> NAVBAR_TWO_X =
            new IntegerProperty("navbar.two.x", 0);
    public static final Property<Integer> NAVBAR_TWO_Y =
            new IntegerProperty("navbar.two.y", 0);
    public static final Property<Integer> NAVBAR_TWO_Z =
            new IntegerProperty("navbar.two.z", 0);
    public static final Property<Integer> NAVBAR_TWO_PITCH =
            new IntegerProperty("navbar.two.pitch", 0);
    public static final Property<Integer> NAVBAR_TWO_YAW =
            new IntegerProperty("navbar.two.yaw", 0);
    public static final Property<String> NAVBAR_TWO_COMMAND =
            new StringProperty("navbar.two.command", "");
    public static final Property<String> NAVBAR_TWO_SERVER =
            new StringProperty("navbar.two.server", "");
    public static final Property<Integer> NAVBAR_TWO_PORT =
            new IntegerProperty("navbar.two.port", 0);
    public static final Property<String> NAVBAR_TWO_MESSAGE =
            new StringProperty("navbar.two.message", "");
    public static final Property<String> NAVBAR_TWO_RIGHT_CLICK =
            new StringProperty("navbar.two.right-click", "");
    public static final Property<String> NAVBAR_TWO_LEFT_CLICK =
            new StringProperty("navbar.two.left-click", "");
    //Slot Three
    public static final Property<Boolean> NAVBAR_THREE_ENABLED =
            new BooleanProperty("navbar.three.enabled", false);
    public static final Property<String> NAVBAR_THREE_TYPE =
            new StringProperty("navbar.three.type", "");
    public static final Property<String> NAVBAR_THREE_NAME =
            new StringProperty("navbar.three.name", "");
    public static final Property<String> NAVBAR_THREE_SKULL =
            new StringProperty("navbar.three.skull", "");
    public static final Property<Integer> NAVBAR_THREE_X =
            new IntegerProperty("navbar.three.x", 0);
    public static final Property<Integer> NAVBAR_THREE_Y =
            new IntegerProperty("navbar.three.y", 0);
    public static final Property<Integer> NAVBAR_THREE_Z =
            new IntegerProperty("navbar.three.z", 0);
    public static final Property<Integer> NAVBAR_THREE_PITCH =
            new IntegerProperty("navbar.three.pitch", 0);
    public static final Property<Integer> NAVBAR_THREE_YAW =
            new IntegerProperty("navbar.three.yaw", 0);
    public static final Property<String> NAVBAR_THREE_COMMAND =
            new StringProperty("navbar.three.command", "");
    public static final Property<String> NAVBAR_THREE_SERVER =
            new StringProperty("navbar.three.server", "");
    public static final Property<Integer> NAVBAR_THREE_PORT =
            new IntegerProperty("navbar.three.port", 0);
    public static final Property<String> NAVBAR_THREE_MESSAGE =
            new StringProperty("navbar.three.message", "");
    public static final Property<String> NAVBAR_THREE_RIGHT_CLICK =
            new StringProperty("navbar.three.right-click", "");
    public static final Property<String> NAVBAR_THREE_LEFT_CLICK =
            new StringProperty("navbar.three.left-click", "");
    //Slot Four
    public static final Property<Boolean> NAVBAR_FOUR_ENABLED =
            new BooleanProperty("navbar.four.enabled", false);
    public static final Property<String> NAVBAR_FOUR_TYPE =
            new StringProperty("navbar.four.type", "");
    public static final Property<String> NAVBAR_FOUR_NAME =
            new StringProperty("navbar.four.name", "");
    public static final Property<String> NAVBAR_FOUR_SKULL =
            new StringProperty("navbar.four.skull", "");
    public static final Property<Integer> NAVBAR_FOUR_X =
            new IntegerProperty("navbar.four.x", 0);
    public static final Property<Integer> NAVBAR_FOUR_Y =
            new IntegerProperty("navbar.four.y", 0);
    public static final Property<Integer> NAVBAR_FOUR_Z =
            new IntegerProperty("navbar.four.z", 0);
    public static final Property<Integer> NAVBAR_FOUR_PITCH =
            new IntegerProperty("navbar.four.pitch", 0);
    public static final Property<Integer> NAVBAR_FOUR_YAW =
            new IntegerProperty("navbar.four.yaw", 0);
    public static final Property<String> NAVBAR_FOUR_COMMAND =
            new StringProperty("navbar.four.command", "");
    public static final Property<String> NAVBAR_FOUR_SERVER =
            new StringProperty("navbar.four.server", "");
    public static final Property<Integer> NAVBAR_FOUR_PORT =
            new IntegerProperty("navbar.four.port", 0);
    public static final Property<String> NAVBAR_FOUR_MESSAGE =
            new StringProperty("navbar.four.message", "");
    public static final Property<String> NAVBAR_FOUR_RIGHT_CLICK =
            new StringProperty("navbar.four.right-click", "");
    public static final Property<String> NAVBAR_FOUR_LEFT_CLICK =
            new StringProperty("navbar.four.left-click", "");
    //Slot Five
    public static final Property<Boolean> NAVBAR_FIVE_ENABLED =
            new BooleanProperty("navbar.five.enabled", false);
    public static final Property<String> NAVBAR_FIVE_TYPE =
            new StringProperty("navbar.five.type", "");
    public static final Property<String> NAVBAR_FIVE_NAME =
            new StringProperty("navbar.five.name", "");
    public static final Property<String> NAVBAR_FIVE_SKULL =
            new StringProperty("navbar.five.skull", "");
    public static final Property<Integer> NAVBAR_FIVE_X =
            new IntegerProperty("navbar.five.x", 0);
    public static final Property<Integer> NAVBAR_FIVE_Y =
            new IntegerProperty("navbar.five.y", 0);
    public static final Property<Integer> NAVBAR_FIVE_Z =
            new IntegerProperty("navbar.five.z", 0);
    public static final Property<Integer> NAVBAR_FIVE_PITCH =
            new IntegerProperty("navbar.five.pitch", 0);
    public static final Property<Integer> NAVBAR_FIVE_YAW =
            new IntegerProperty("navbar.five.yaw", 0);
    public static final Property<String> NAVBAR_FIVE_COMMAND =
            new StringProperty("navbar.five.command", "");
    public static final Property<String> NAVBAR_FIVE_SERVER =
            new StringProperty("navbar.five.server", "");
    public static final Property<Integer> NAVBAR_FIVE_PORT =
            new IntegerProperty("navbar.five.port", 0);
    public static final Property<String> NAVBAR_FIVE_MESSAGE =
            new StringProperty("navbar.five.message", "");
    public static final Property<String> NAVBAR_FIVE_RIGHT_CLICK =
            new StringProperty("navbar.five.right-click", "");
    public static final Property<String> NAVBAR_FIVE_LEFT_CLICK =
            new StringProperty("navbar.five.left-click", "");
    //Slot Six
    public static final Property<Boolean> NAVBAR_SIX_ENABLED =
            new BooleanProperty("navbar.six.enabled", false);
    public static final Property<String> NAVBAR_SIX_TYPE =
            new StringProperty("navbar.six.type", "");
    public static final Property<String> NAVBAR_SIX_NAME =
            new StringProperty("navbar.six.name", "");
    public static final Property<String> NAVBAR_SIX_SKULL =
            new StringProperty("navbar.six.skull", "");
    public static final Property<Integer> NAVBAR_SIX_X =
            new IntegerProperty("navbar.six.x", 0);
    public static final Property<Integer> NAVBAR_SIX_Y =
            new IntegerProperty("navbar.six.y", 0);
    public static final Property<Integer> NAVBAR_SIX_Z =
            new IntegerProperty("navbar.six.z", 0);
    public static final Property<Integer> NAVBAR_SIX_PITCH =
            new IntegerProperty("navbar.six.pitch", 0);
    public static final Property<Integer> NAVBAR_SIX_YAW =
            new IntegerProperty("navbar.six.yaw", 0);
    public static final Property<String> NAVBAR_SIX_COMMAND =
            new StringProperty("navbar.six.command", "");
    public static final Property<String> NAVBAR_SIX_SERVER =
            new StringProperty("navbar.six.server", "");
    public static final Property<Integer> NAVBAR_SIX_PORT =
            new IntegerProperty("navbar.six.port", 0);
    public static final Property<String> NAVBAR_SIX_MESSAGE =
            new StringProperty("navbar.six.message", "");
    public static final Property<String> NAVBAR_SIX_RIGHT_CLICK =
            new StringProperty("navbar.six.right-click", "");
    public static final Property<String> NAVBAR_SIX_LEFT_CLICK =
            new StringProperty("navbar.six.left-click", "");
    //Slot Seven
    public static final Property<Boolean> NAVBAR_SEVEN_ENABLED =
            new BooleanProperty("navbar.seven.enabled", false);
    public static final Property<String> NAVBAR_SEVEN_TYPE =
            new StringProperty("navbar.seven.type", "");
    public static final Property<String> NAVBAR_SEVEN_NAME =
            new StringProperty("navbar.seven.name", "");
    public static final Property<String> NAVBAR_SEVEN_SKULL =
            new StringProperty("navbar.seven.skull", "");
    public static final Property<Integer> NAVBAR_SEVEN_X =
            new IntegerProperty("navbar.seven.x", 0);
    public static final Property<Integer> NAVBAR_SEVEN_Y =
            new IntegerProperty("navbar.seven.y", 0);
    public static final Property<Integer> NAVBAR_SEVEN_Z =
            new IntegerProperty("navbar.seven.z", 0);
    public static final Property<Integer> NAVBAR_SEVEN_PITCH =
            new IntegerProperty("navbar.seven.pitch", 0);
    public static final Property<Integer> NAVBAR_SEVEN_YAW =
            new IntegerProperty("navbar.seven.yaw", 0);
    public static final Property<String> NAVBAR_SEVEN_COMMAND =
            new StringProperty("navbar.seven.command", "");
    public static final Property<String> NAVBAR_SEVEN_SERVER =
            new StringProperty("navbar.seven.server", "");
    public static final Property<Integer> NAVBAR_SEVEN_PORT =
            new IntegerProperty("navbar.seven.port", 0);
    public static final Property<String> NAVBAR_SEVEN_MESSAGE =
            new StringProperty("navbar.seven.message", "");
    public static final Property<String> NAVBAR_SEVEN_RIGHT_CLICK =
            new StringProperty("navbar.seven.right-click", "");
    public static final Property<String> NAVBAR_SEVEN_LEFT_CLICK =
            new StringProperty("navbar.seven.left-click", "");
    //Slot Eight
    public static final Property<Boolean> NAVBAR_EIGHT_ENABLED =
            new BooleanProperty("navbar.eight.enabled", false);
    public static final Property<String> NAVBAR_EIGHT_TYPE =
            new StringProperty("navbar.eight.type", "");
    public static final Property<String> NAVBAR_EIGHT_NAME =
            new StringProperty("navbar.eight.name", "");
    public static final Property<String> NAVBAR_EIGHT_SKULL =
            new StringProperty("navbar.eight.skull", "");
    public static final Property<Integer> NAVBAR_EIGHT_X =
            new IntegerProperty("navbar.eight.x", 0);
    public static final Property<Integer> NAVBAR_EIGHT_Y =
            new IntegerProperty("navbar.eight.y", 0);
    public static final Property<Integer> NAVBAR_EIGHT_Z =
            new IntegerProperty("navbar.eight.z", 0);
    public static final Property<Integer> NAVBAR_EIGHT_PITCH =
            new IntegerProperty("navbar.eight.pitch", 0);
    public static final Property<Integer> NAVBAR_EIGHT_YAW =
            new IntegerProperty("navbar.eight.yaw", 0);
    public static final Property<String> NAVBAR_EIGHT_COMMAND =
            new StringProperty("navbar.eight.command", "");
    public static final Property<String> NAVBAR_EIGHT_SERVER =
            new StringProperty("navbar.eight.server", "");
    public static final Property<Integer> NAVBAR_EIGHT_PORT =
            new IntegerProperty("navbar.eight.port", 0);
    public static final Property<String> NAVBAR_EIGHT_MESSAGE =
            new StringProperty("navbar.eight.message", "");
    public static final Property<String> NAVBAR_EIGHT_RIGHT_CLICK =
            new StringProperty("navbar.eight.right-click", "");
    public static final Property<String> NAVBAR_EIGHT_LEFT_CLICK =
            new StringProperty("navbar.eight.left-click", "");
    //Slot Nine
    public static final Property<Boolean> NAVBAR_NINE_ENABLED =
            new BooleanProperty("navbar.nine.enabled", false);
    public static final Property<String> NAVBAR_NINE_TYPE =
            new StringProperty("navbar.nine.type", "");
    public static final Property<String> NAVBAR_NINE_NAME =
            new StringProperty("navbar.nine.name", "");
    public static final Property<String> NAVBAR_NINE_SKULL =
            new StringProperty("navbar.nine.skull", "");
    public static final Property<Integer> NAVBAR_NINE_X =
            new IntegerProperty("navbar.nine.x", 0);
    public static final Property<Integer> NAVBAR_NINE_Y =
            new IntegerProperty("navbar.nine.y", 0);
    public static final Property<Integer> NAVBAR_NINE_Z =
            new IntegerProperty("navbar.nine.z", 0);
    public static final Property<Integer> NAVBAR_NINE_PITCH =
            new IntegerProperty("navbar.nine.pitch", 0);
    public static final Property<Integer> NAVBAR_NINE_YAW =
            new IntegerProperty("navbar.nine.yaw", 0);
    public static final Property<String> NAVBAR_NINE_COMMAND =
            new StringProperty("navbar.nine.command", "");
    public static final Property<String> NAVBAR_NINE_SERVER =
            new StringProperty("navbar.nine.server", "");
    public static final Property<Integer> NAVBAR_NINE_PORT =
            new IntegerProperty("navbar.nine.port", 0);
    public static final Property<String> NAVBAR_NINE_MESSAGE =
            new StringProperty("navbar.nine.message", "");
    public static final Property<String> NAVBAR_NINE_RIGHT_CLICK =
            new StringProperty("navbar.nine.right-click", "");
    public static final Property<String> NAVBAR_NINE_LEFT_CLICK =
            new StringProperty("navbar.nine.left-click", "");
    //Offline-Item
    public static final Property<String> NAVBAR_OFFLINE_ITEM_TYPE =
            new StringProperty("navbar.offline-item.type", "BARRIER");
    public static final Property<String> NAVBAR_OFFLINE_ITEM_NAME =
            new StringProperty("navbar.offline-item.name", "§4Offline");
    public static final Property<String> NAVBAR_OFFLINE_ITEM_SKULL =
            new StringProperty("navbar.offline-item.skull", "");

    //Settings
    //General
    public static final Property<String> SETTINGS_IP =
            new StringProperty("settings.ip", "localhost");
    public static final Property<Integer> SETTINGS_COOLDOWN =
            new IntegerProperty("settings.cooldown", 50);
    //Effect
    public static final Property<String> SETTINGS_EFFECT_TYPE =
            new StringProperty("settings.effect.type", "NIGHT_VISION");
    public static final Property<Integer> SETTINGS_EFFECT_DURATION =
            new IntegerProperty("settings.effect.duration", 99999);
    public static final Property<Integer> SETTINGS_EFFECT_AMPLIFIER =
            new IntegerProperty("settings.effect.amplifier", 255);
    public static final Property<Boolean> SETTINGS_EFFECT_PARTICLES =
            new BooleanProperty("settings.effect.particles", false);
    //Sounds
    public static final Property<String> SETTINGS_SOUNDS_TELEPORT =
            new StringProperty("settings.sounds.teleport", "ENTITY_ENDERMEN_TELEPORT");
    public static final Property<String> SETTINGS_SOUNDS_CONNECT1 =
            new StringProperty("settings.sounds.connect1", "ENTITY_EXPERIENCE_ORB_PICKUP");
    public static final Property<String> SETTINGS_SOUNDS_CONNECT2 =
            new StringProperty("settings.sounds.connect2", "ENTITY_PLAYER_LEVELUP");
    //Spawn
    public static final Property<Integer> SETTINGS_SPAWN_X =
            new IntegerProperty("settings.spawn.x", 0);
    public static final Property<Integer> SETTINGS_SPAWN_Y =
            new IntegerProperty("settings.spawn.y", 0);
    public static final Property<Integer> SETTINGS_SPAWN_Z =
            new IntegerProperty("settings.spawn.z", 0);
    public static final Property<Integer> SETTINGS_SPAWN_PITCH =
            new IntegerProperty("settings.spawn.pitch", 0);
    public static final Property<Integer> SETTINGS_SPAWN_YAW =
            new IntegerProperty("settings.spawn.yaw", 0);

    //Docs: https://github.com/AuthMe/ConfigMe/wiki/Technical-overview
    //Example: https://github.com/AuthMe/ConfigMe/tree/master/src/test/java/ch/jalu/configme/demo
}
