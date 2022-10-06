package com.joostmsoftware.startingrevamp.util;

import com.joostmsoftware.startingrevamp.item.StartingRevampItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Consumer;

import static com.joostmsoftware.startingrevamp.StartingRevamp.GROUP;
import static com.joostmsoftware.startingrevamp.block.StartingRevampRocks.ROCK;
import static com.joostmsoftware.startingrevamp.block.StartingRevampTwigs.*;
import static com.joostmsoftware.startingrevamp.item.StartingRevampItems.GRASS_VIBER;
import static com.joostmsoftware.startingrevamp.item.StartingRevampToolItems.*;

public class StartingRevampDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(@NotNull FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(StartingRevampEnglishLangProvider::new);
        fabricDataGenerator.addProvider(StartingRevampModelGenerator::new);
        fabricDataGenerator.addProvider(StartingRevampTagGenerator::new);
        fabricDataGenerator.addProvider(StartingRevampRecipeGenerator::new);
    }

    private static class StartingRevampEnglishLangProvider extends FabricLanguageProvider {

        protected StartingRevampEnglishLangProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator, "en_us");
        }

        @Override
        public void generateTranslations(@NotNull TranslationBuilder translationBuilder) {
            translationBuilder.add(ROCK, "Rock");
            translationBuilder.add(OAK_TWIG, "Oak Twig");
            translationBuilder.add(BIRCH_TWIG, "Birch Twig");
            translationBuilder.add(DARK_OAK_TWIG, "Dark Oak Twig");
            translationBuilder.add(ACACIA_TWIG, "Acacia Twig");
            translationBuilder.add(SPRUCE_TWIG, "Spruce Twig");
            translationBuilder.add(MANGROVE_TWIG, "Mangrove Twig");
            translationBuilder.add(JUNGLE_TWIG, "Jungle Twig");
            translationBuilder.add(FLINT_AXE, "Flint Axe");
            translationBuilder.add(FLINT_HOE, "Flint Hoe");
            translationBuilder.add(FLINT_PICKAXE, "Flint Pickaxe");
            translationBuilder.add(FLINT_SHOVEL, "Flint Shovel");
            translationBuilder.add(FLINT_SWORD, "Flint Sword");
            translationBuilder.add(FLINT_GRASS_CUTTERS, "Flint Grass Cutters");
            translationBuilder.add(GRASS_VIBER, "Grass Viber");
            translationBuilder.add(GROUP, "Starting Revamp");

            try {
                Path existingFile = dataGenerator.getModContainer().findPath("assets/startingrevamp/lang/en_us.existing.json").get();
                translationBuilder.add(existingFile);
            } catch (IOException e) {
                throw new RuntimeException("Failed to add existing language file!", e);
            }
        }
    }

    private static class StartingRevampModelGenerator extends FabricModelProvider {

        public StartingRevampModelGenerator(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        public void generateBlockStateModels(@NotNull BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerSimpleCubeAll(ROCK);
            blockStateModelGenerator.registerSimpleCubeAll(OAK_TWIG);
            blockStateModelGenerator.registerSimpleCubeAll(DARK_OAK_TWIG);
            blockStateModelGenerator.registerSimpleCubeAll(SPRUCE_TWIG);
            blockStateModelGenerator.registerSimpleCubeAll(ACACIA_TWIG);
            blockStateModelGenerator.registerSimpleCubeAll(BIRCH_TWIG);
            blockStateModelGenerator.registerSimpleCubeAll(MANGROVE_TWIG);
            blockStateModelGenerator.registerSimpleCubeAll(JUNGLE_TWIG);
        }

        @Override
        public void generateItemModels(@NotNull ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(FLINT_AXE, Models.GENERATED);
            itemModelGenerator.register(FLINT_HOE, Models.GENERATED);
            itemModelGenerator.register(FLINT_PICKAXE, Models.GENERATED);
            itemModelGenerator.register(FLINT_SHOVEL, Models.GENERATED);
            itemModelGenerator.register(FLINT_SWORD, Models.GENERATED);
            itemModelGenerator.register(FLINT_GRASS_CUTTERS, Models.GENERATED);
            itemModelGenerator.register(GRASS_VIBER, Models.GENERATED);
        }
    }

    private static class StartingRevampTagGenerator extends FabricTagProvider<Item> {

        /**
         * Construct a new {@link FabricTagProvider} with the default computed path.
         *
         * <p>Common implementations of this class are provided. For example @see BlockTagProvider
         *
         * @param dataGenerator The data generator instance
         */
        public StartingRevampTagGenerator(FabricDataGenerator dataGenerator) {
            super(dataGenerator, Registry.ITEM);
        }

        @Override
        protected void generateTags() {
            getOrCreateTagBuilder(StartingRevampTags.TWIGS)
                    .add(StartingRevampItems.ACACIA_TWIG)
                    .add(StartingRevampItems.OAK_TWIG)
                    .add(StartingRevampItems.DARK_OAK_TWIG)
                    .add(StartingRevampItems.JUNGLE_TWIG)
                    .add(StartingRevampItems.BIRCH_TWIG)
                    .add(StartingRevampItems.SPRUCE_TWIG)
                    .add(StartingRevampItems.MANGROVE_TWIG);

            getOrCreateTagBuilder(StartingRevampTags.WOOLS)
                    .add(Items.WHITE_WOOL)
                    .add(Items.BLACK_WOOL)
                    .add(Items.BLUE_WOOL)
                    .add(Items.CYAN_WOOL)
                    .add(Items.GRAY_WOOL)
                    .add(Items.BROWN_WOOL)
                    .add(Items.GREEN_WOOL)
                    .add(Items.LIGHT_BLUE_WOOL)
                    .add(Items.LIGHT_GRAY_WOOL)
                    .add(Items.LIME_WOOL)
                    .add(Items.MAGENTA_WOOL)
                    .add(Items.ORANGE_WOOL)
                    .add(Items.PINK_WOOL)
                    .add(Items.PURPLE_WOOL)
                    .add(Items.RED_WOOL)
                    .add(Items.YELLOW_WOOL);
        }
    }

    private static class StartingRevampRecipeGenerator extends FabricRecipeProvider {

        public StartingRevampRecipeGenerator(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
            ShapedRecipeJsonBuilder.create(FLINT_AXE)
                    .pattern("XX ")
                    .pattern("XO ")
                    .pattern(" I ")
                    .input('X', Items.FLINT)
                    .input('O', GRASS_VIBER)
                    .input('I', Items.STICK)
                    .criterion("has_flint", conditionsFromItem(Items.FLINT))
                    .offerTo(exporter);

            ShapedRecipeJsonBuilder.create(FLINT_HOE)
                    .pattern("XX ")
                    .pattern(" O ")
                    .pattern(" I ")
                    .input('X', Items.FLINT)
                    .input('O', GRASS_VIBER)
                    .input('I', Items.STICK)
                    .criterion("has_flint", conditionsFromItem(Items.FLINT))
                    .offerTo(exporter);

            ShapedRecipeJsonBuilder.create(FLINT_PICKAXE)
                    .pattern("XXX")
                    .pattern(" O ")
                    .pattern(" I ")
                    .input('X', Items.FLINT)
                    .input('O', GRASS_VIBER)
                    .input('I', Items.STICK)
                    .criterion("has_flint", conditionsFromItem(Items.FLINT))
                    .offerTo(exporter);

            ShapedRecipeJsonBuilder.create(FLINT_SHOVEL)
                    .pattern(" X ")
                    .pattern(" O ")
                    .pattern(" I ")
                    .input('X', Items.FLINT)
                    .input('O', GRASS_VIBER)
                    .input('I', Items.STICK)
                    .criterion("has_flint", conditionsFromItem(Items.FLINT))
                    .offerTo(exporter);

            ShapedRecipeJsonBuilder.create(FLINT_SWORD)
                    .pattern(" X ")
                    .pattern(" X ")
                    .pattern(" I ")
                    .input('X', Items.FLINT)
                    .input('I', Items.STICK)
                    .criterion("has_flint", conditionsFromItem(Items.FLINT))
                    .offerTo(exporter);

            ShapedRecipeJsonBuilder.create(FLINT_GRASS_CUTTERS)
                    .pattern(" X ")
                    .pattern("O  ")
                    .pattern(" X ")
                    .input('X', Items.FLINT)
                    .input('O', Items.STRING)
                    .criterion("has_flint", conditionsFromItem(Items.FLINT))
                    .offerTo(exporter);

            ShapelessRecipeJsonBuilder.create(Items.STRING).input(StartingRevampTags.WOOLS).criterion("has_wool", conditionsFromTag(StartingRevampTags.WOOLS)).offerTo(exporter);
            ShapelessRecipeJsonBuilder.create(Items.STICK).input(StartingRevampTags.TWIGS).criterion("has_twig", conditionsFromTag(StartingRevampTags.TWIGS)).offerTo(exporter);
        }
    }
}
